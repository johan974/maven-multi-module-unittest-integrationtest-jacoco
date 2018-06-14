# maven-multi-module-unittest-integrationtest-jacoco

Demo of 'Maven multi module' project WITH unit- and/or integration testing with FindBugs and Jacoco code coverage

# Results

   * Project copmlete Jacoco datafile : project-base / target / aggregate-exec / aggregate.exec
   * Project complete Jacoco report   ; project-base / test-reporting / site / index.html
   * FindBugs report
   
# Run

   * mvn clean install                      => unit testing + reporting
   * mvn clean install -P integration test  => integration testing + reporting
   * mvn clean install -P test-all          => unit AND integration testing + (combined) reporting !
   
# Overview: 
<img src="TestResults.png" alt="Overview of the results"/>)
