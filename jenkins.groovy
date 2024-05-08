pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo "checkoting ..."
            }
        }

        stage('Build') {
            steps {
                echo "building ..."
            }
        }

        stage('Tests') {
            steps {
                echo "testing ..."
            }
        }

        stage('Allure Report') {
            steps {
                echo "repoting ..."
            }
        }
    }
}