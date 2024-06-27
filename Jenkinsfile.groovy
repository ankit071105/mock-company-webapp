pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    sh './gradlew assemble'
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    sh './gradlew test'
                }
            }
        }
    }
}
