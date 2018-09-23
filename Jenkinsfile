node {
   stage('Preparation') {
      checkout scm
   }
   stage('build and unit-test') {
      // all tests: other variants: only unit, integration, or all (incl. functional testing)
      sh 'mvn clean install -P test-all'
   }
   stage('SonarQube analysis') {
      withSonarQubeEnv('sonar2') {
        sh 'mvn sonar:sonar'
      }
   }
}
