pipeline {
    agent any // Specifies where the pipeline will run
    stages {
        stage('Build') {
            steps {
                echo 'Building..' // Replace with your build commands (e.g., sh 'mvn clean install')
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..' // Replace with your test commands (e.g., sh 'mvn test')
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....' // Replace with your deployment commands
            }
        }
    }
}