pipeline {

    agent { label 'slave1' }
    stages {

        stage('unit-test') {
            steps {
                bat(/mvn -fn clean install/)
            }
        }
    }

    post {
            always {
                echo 'I will always say Hello again!'
                junit '**/target/surefire-reports/TEST-*.xml'
				publishGherkinResults '**/*OctaneGherkinResults.xml'
            }
        }

}


