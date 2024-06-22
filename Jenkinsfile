pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                // Add deployment steps here (e.g., deploying to AWS EC2)
                // Example: sh 'scp target/my-app.jar user@your-ec2-instance:/path/to/deploy'
            }
        }
    }
}
