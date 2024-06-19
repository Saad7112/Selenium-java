pipeline {
    agent any

    stages {
        stage('Build and Deploy') {
            steps {
                script {
                    sh 'docker compose up -d'
                }
            }
        }

        stage('Run Selenium Tests') {
            steps {
                script {
                    sh 'docker compose run selenium-tests'
                }
            }
        }
    }

    post {
        always {
            script {
                sh 'docker compose down'
            }
        }
    }
}
