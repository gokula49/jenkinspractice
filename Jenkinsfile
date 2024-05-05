pipeline {
    agent any // This specifies that the pipeline can run on any available agent in Jenkins

    stages {
        stage('Build') {
            steps {
                // Add build steps here
                sh 'echo "Building..."'
            }
        }
        stage('Test') {
            steps {
                // Add test steps here
                sh 'echo "Testing..."'
            }
        }
        stage('Deploy') {
            steps {
                // Add deployment steps here
                sh 'echo "Deploying..."'
            }
        }
    }
}
