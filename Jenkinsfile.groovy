pipeline {
    stages {
        stage('test run batch') {
            steps {
                echo "Testing script.."
                bat(script: "HelloWorld.bat")
            }
        }
    }
}