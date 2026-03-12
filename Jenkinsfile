pipeline {
    agent any
    
    tools {
        // This pulls the Maven installation configured in Jenkins Global Tool Configuration
        maven 'Maven' 
    }

    stages {
        stage('Build') {
            steps {
                echo 'Building with Maven...'
                // 'sh' for Linux/macOS, use 'bat' if your agent is Windows
                sh 'mvn clean package -DskipTests'
            }
        }
        
        stage('Test') {
            steps {
                echo 'Running Unit Tests...'
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying Artifact...'
                // Example: archiving the jar file so it's saved in Jenkins
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }
    }
}