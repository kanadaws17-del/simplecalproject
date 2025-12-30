pipeline {
    agent any
    
    tools {
        // Make sure Maven is configured in Jenkins Global Tool Configuration
        maven 'Maven-3.9.6' // You'll configure this name in Jenkins
        jdk 'JDK-17'        // You'll configure this name in Jenkins
    }
    
    stages {
        stage('Checkout') {
            steps {
                echo '========== Checking out code from GitHub =========='
                // Jenkins automatically checks out code from GitHub
                checkout scm
            }
        }
        

		stage('Build') {
			steps {
				echo 'Building the project ========='
				sh 'mvn clean install'   
			}
		}
        
        stage('Test') {
            steps {
                echo '========== Running Unit Tests =========='
                // Run all tests
                sh 'mvn test'
            }
            post {
                always {
                    // Publish test results
                    junit '**/target/surefire-reports/*.xml'
                }
            }
        }
        
        stage('Package') {
            steps {
                echo '========== Packaging the application =========='
                // Create JAR file
                sh 'mvn package -DskipTests'
            }
        }
        
        stage('Deploy') {
            steps {
                echo '========== Deploying the application =========='
                // For this demo, we'll just run the application
                // In real projects, you'd deploy to a server
                sh 'java -jar target/simple-calculator-1.0-SNAPSHOT.jar'
                
                echo '========== Deployment Complete! =========='
                echo 'JAR file created at: target/simple-calculator-1.0-SNAPSHOT.jar'
            }
        }
    }
    
    post {
        success {
            echo '========================================='
            echo '✅ Pipeline executed successfully!'
            echo '========================================='
        }
        failure {
            echo '========================================='
            echo '❌ Pipeline failed! Check the logs above.'
            echo '========================================='
        }
    }
}
