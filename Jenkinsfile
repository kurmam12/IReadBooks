pipeline {
    agent any
    
    tools {
        // Ensure 'Maven' matches the name in Global Tool Configuration exactly
        maven 'Maven' 
    }

    stages {
        stage('Build') {
            steps {
                echo 'Compiling and Packaging...'
                // Changed 'sh' to 'bat' for Windows
                bat 'mvn clean package -DskipTests'
            }
        }
        
        stage('Test') {
            steps {
                echo 'Running Unit Tests...'
                bat 'mvn test'
            }
        }

        stage('Install') {
            steps {
                echo 'Installing artifact to local .m2 repository...'
                bat 'mvn install -DskipTests' 
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