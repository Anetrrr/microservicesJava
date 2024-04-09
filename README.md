# microservicesJava
Creating microservices - Java

Writing integration tests for the endpoints:
  - Add multiple Testcontainer dependencies in the pom.xml file
  - install mongodb container in the application. go to testcontainer documentation website, go to modules, go to mongodb module. add the maven dependency to the pom file.
  - you can always remove the version because the versions are defined in the test container dependency bill of materials (bom)
  - Add JUnit5/jupiter dependency. go to test framework integration and then to JUnit 5. copy the maven dependency and add to pom file.
