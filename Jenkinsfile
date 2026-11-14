pipeline {
    agent any
    tools {
        maven 'Maven-3.10.0'
    }
    stages {
        stage('Build and Run Regression Tests') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
    post {
        always {
            junit 'target/surefire-reports/*.xml'
            jacoco(
                execPattern: 'target/jacoco.exec',
                classPattern: 'target/classes',
                sourcePattern: 'src/main/java',
                exclusionPattern: 'src/test*'
            )
        }
    }
}
