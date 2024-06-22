pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        stage('Build and Test') {
            steps {
                script {
                    def mvnCmd = isUnix() ? 'mvn' : 'mvn.bat'
                    sh "${mvnCmd} clean install"
                    sh "${mvnCmd} test"
                }
            }
        }
        stage('Deploy') {
            when {
                expression { currentBuild.resultIsBetterOrEqualTo('SUCCESS') }
            }
            steps {
                // Add deployment steps here (e.g., deploying to AWS EC2)
                // Example: sh 'scp target/my-app.jar user@your-ec2-instance:/path/to/deploy'
				echo 'deployed successfully!!'
            }
        }
    }
}
