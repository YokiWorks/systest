# System Test
This is a little challenge based on a real life problem.

## The Challenge
Companies often want to use JUnit in order to execute System tests.

Unlike Unit Tests, System tests have extremly long setup and cleanup times.

This means that JUnit's "setup-testFunction-tearDown" model wastes too much time

One way to tackle this, is to group a big number of test classes, performing a specific setup once for all of them and a cleanup once all of them are done.

## In this Repo
This repo contains a set of 4 test classes (Azure, Scarlet, UltraMarine and Vermilion) and two test groups (Blue, for Azure & Ultramarine. Red, for Scarlet & Vermilion).

The test classes are in "src/main" since this is an integration test suite for some imaginary project. They are not unit tests.

The pom builds a self executing jar which runs the tests. Of course, they fail.

## Building & Running
To build the tests:

    mvn package
    
To execute after build:

    java -jar target\systest-1.0-SNAPSHOT.jar
## What now
You need to create a harness that will always run group setup before group tests and teardown after them. 

This must work correctly when tests are run from main.

Extra points if the group also automatically kicks in when a test is run from the IDE using right-click.

## Some closing thoughts

You can create a new TestRunner. Or some annotation. Or maybe clever use of TestSuites. Or even a base class for tests.
Whatever you do - be able to explain why you did it, and why it is a good enough solution that will continue to be convenient as tests and test groups are added.
