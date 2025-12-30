# Simple Calculator - CI/CD Demo Project

A basic Java calculator application to demonstrate CI/CD pipeline with Jenkins and GitHub.

## Features
- Addition, Subtraction, Multiplication, Division
- Unit tests with JUnit
- Maven build system
- Jenkins pipeline integration

## Prerequisites
- Java 17 or higher
- Maven 3.6+
- Jenkins (for CI/CD)

## Build & Run Locally

### Build the project
```bash
mvn clean compile
```

### Run tests
```bash
mvn test
```

### Create JAR file
```bash
mvn package
```

### Run the application
```bash
java -jar target/simple-calculator-1.0-SNAPSHOT.jar
```

## CI/CD Pipeline

This project uses Jenkins for automated build, test, and deployment.

### Pipeline Stages:
1. **Checkout** - Gets code from GitHub
2. **Build** - Compiles the Java code
3. **Test** - Runs JUnit tests
4. **Package** - Creates executable JAR file
5. **Deploy** - Runs the application

## Project Structure
```
SimpleCalculator/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── myproject/
│   │               └── Calculator.java
│   └── test/
│       └── java/
│           └── com/
│               └── myproject/
│                   └── CalculatorTest.java
├── pom.xml
├── Jenkinsfile
└── README.md
```

## Author
Your Name - DevOps Learning Journey 2025
