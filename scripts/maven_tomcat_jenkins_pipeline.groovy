pipeline {
    agent any

    stages {
        stage('git clone') {
            steps {
                git branch: 'main', url: 'https://github.com/CloudTechDevOps/project-1-maven-jenkins-CICD-docker-eks-.git'
            }
        }
        stage('maven clean') {
            steps {
                sh 'mvn clean'
            }
        }
        stage('maven install'){
            steps {
                sh 'mvn install'
            }
        }
        stage('war deploy') {
            steps {
                deploy adapters: [tomcat9(credentialsId: 'tomcat', path: '', url: 'http://43.205.206.116:8081/')], contextPath: null, war: '**/*.war'
            }
        }
    }
}
