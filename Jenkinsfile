pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'pulled repository changes from github succcesfully!'
            }
        }
        stage('Build and Test') {
            steps {
                script {
                    echo 'build successfully!!'
                }
            }
        }

        stage('Deploy to feature') {
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
