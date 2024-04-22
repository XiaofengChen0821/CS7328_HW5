# CS7328 HW5 Team 3 Unit Test Assignment Setup and Test Run Guide

## Team Members

- **Ping He**
- **Xiaofeng Chen**
- **Pengfang Chen**
- **Rebecca Kuhlman**

## Prerequisites

Before setting up the project, ensure you have the following installed:

- JDK 8
- Git
- IntelliJ IDEA or your preferred IDE with Maven integration

## Cloning the Repository

To clone the repository, run the following command:

```shell
https://github.com/XiaofengChen0821/CS7328_HW5.git
```

## Opening the Project in IntelliJ IDEA

1. Start IntelliJ IDEA.
2. Select "Open or Import".
3. Navigate to the cloned repository's directory.
4. Select the `pom.xml` file and click "OK" to open the project.

IntelliJ IDEA will automatically download the required dependencies.

## Running Test Cases

### Running Individual Test Cases

1. Navigate to the `src/test/java` directory in the Project view.
2. Right-click on a specific test case or a package with test cases.
3. Select "Run 'NameOfTest'" to execute individual tests.

### Running All Test Cases

1. Open the Maven tool window.
2. Navigate to the "Lifecycle" section.
3. Double-click on the "test" phase to execute all tests.

### Viewing Test Results

The results will be shown in the Run window at the bottom of the IDE. You can interact with individual tests to see
detailed output or errors.

## Troubleshooting

If you encounter any issues:

- Ensure the project's JDK is set to Java 8.
- Check for compilation errors in the project.
- Make sure that test methods are properly annotated with `@Test` and other JUnit 5 annotations.

## Additional Tips

- Use IntelliJ IDEA shortcuts to run tests more efficiently (`Ctrl + Shift + F10` to run tests in the current class).
- Look for the green play icons next to test methods for quick run/debug actions.
- Consider running tests with coverage to assess which parts of your code are covered by tests.
