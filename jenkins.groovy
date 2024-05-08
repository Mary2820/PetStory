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

        stage('Tests') {
            steps {
                sh 'mvn verify'
            }
        }

        stage('Allure Report') {
            steps {
                allureReport(reportDir: 'target/allure-reports')
            }
        }
    }
}