pipeline {
    agent any

    stages {
        stage('Build Docker Image') {
            steps {
                script {
                    // Build the Docker image using the Dockerfile in the current directory
                    docker.build('my-spring-boot-app')
                }
            }
        }
        stage('Run Docker Container') {
            steps {
                script {
                    // Run the Docker container from the built image
                    docker.image('my-spring-boot-app').run('-p 8080:8080')
                }
            }
        }
    }
}
