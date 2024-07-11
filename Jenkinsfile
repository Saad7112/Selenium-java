pipeline {
    agent any
    
    tools {
        nodejs 'node'
    }
    
    stages {

        stage('Run Selenium Tests') {
            steps {
                script {
                    
                    dir('C:\\ProgramData\\Jenkins\\selenium-tests') {
                        bat 'mvn test'
                    }
                }
            }
        }
    }
    
    
}
