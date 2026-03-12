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
             sh "mvn install"
            }
        }
        
        stage('Test') {
            steps {
                echo 'Running Unit Tests...'
                
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying Artifact...'
              
            }
        }
    }

}

