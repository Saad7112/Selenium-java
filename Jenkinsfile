pipeline {
    agent any
    
    tools {
        nodejs 'node'
    }
    
    stages {
        stage('Build and Deploy') {
            steps {
                script {
                    bat 'docker compose up -d'
                    // Wait for Selenium Hub to be ready
                }
            }
        }

        stage('Run Selenium Tests') {
            steps {
                script {
                    retry(5) {
                        sleep(time: 10, unit: 'SECONDS')
                    }
                    dir('C:\\ProgramData\\Jenkins\\selenium-tests') {
                        bat 'mvn test'
                    }
                }
            }
        }
    }
    
    post {
        always {
            // Publish Selenium HTML Reports
            publishHTML(target: [
                allowMissing: false,
                alwaysLinkToLastBuild: true,
                keepAll: true,
                reportDir: 'C:/ProgramData/Jenkins/selenium-tests/target/surefire-reports',
                reportFiles: 'report.html',
                reportName: 'Selenium HTML Report'
            ])
        }
    }
}
