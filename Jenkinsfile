pipeline {
    agent any
    
    tools {
        maven 'Maven' 
    }

    stages {
        stage('Build') {
            steps {
                echo 'Compiling and Packaging...'
                sh 'mvn clean package -DskipTests'
            }
        }
        
        stage('Test') {
            steps {
                echo 'Running Unit Tests...'
                sh 'mvn test'
            }
        }

        stage('Install') {
            steps {
                echo 'Installing artifact to local .m2 repository...'
                // This ensures the JAR is available for other projects on this agent
                sh 'mvn install -DskipTests' 
            }
        }

        stage('Deploy') {
            steps {
                echo 'Archiving Artifact...'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }
}