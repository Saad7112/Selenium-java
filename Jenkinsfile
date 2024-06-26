pipeline {
    agent any
    tools {
        nodejs 'node' // Name of the Node.js installation you configured
    }

    stages {
        stage('Build and Deploy') {
            steps {
                script {
                    sh 'docker compose up -d'
                    // Wait for Selenium Hub to be ready
                    
                }
            }
        }

        stage('Run Selenium Tests') {
            steps {
                script {
                    //sh 'docker compose run selenium-tests'
                    // Wait for Selenium Hub to be ready
                    retry(5) {
                        sleep(time: 10, unit: 'SECONDS')
                        
                    }
                    dir('/home/new/saad/test/Selenium-java/selenium-tests'){
                    sh 'mvn test'
                    }
                    
                }
            }
        }
    }
}
