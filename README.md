# test-fixtures-example

Demonstrates Gradle `test-fixtures` plugin within a multi-project build.

There are 2 subprojects:
1. *awesome-fixture* contains fixture code intended to be reused by tests within this multi-project build or other projects
2. *library* demonstrates using the test fixture code, by defining a dependency `testImplementation testFixtures(project(':awesome-fixture'))`

## Publishing

Run `./gradlew publish` to publish to Maven local.

The test fixture library will by default be available at:

` ~/.m2/repository/com/tomgregory/awesome-fixture/0.1.0-SNAPSHOT/awesome-fixture-0.1.0-SNAPSHOT-test-fixtures.jar`

The fixture can then be used by other projects using a similar dependency definition as above:

`testImplementation testFixtures('com.tomgregory:awesome-fixture:0.1.0-SNAPSHOT')`