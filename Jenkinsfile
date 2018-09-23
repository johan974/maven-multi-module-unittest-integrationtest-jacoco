node {
   stage('Preparation') {
      checkout scm
   }
   stage('build and unit-test') {
      sh 'mvn clean package'
   }
   stage('SonarQube analysis') {
      withSonarQubeEnv('sonar2') {
        sh 'mvn sonar:sonar'
      }
   }
}
