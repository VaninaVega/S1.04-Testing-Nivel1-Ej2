# S1.04-Testing-Nivel1-Ej2

#Summary: exercise description

Create a class named CalculoDni that calculates the DNI letter over the number as a parameter.
Create a jUnit class that verifies its correct functioning, parameterizing it so that the test receives a wide spectrum of data and validates whether the calculation is correct for 10 predefined DNI numbers.

java 22

#Requirements

Programming language: Java 22

Development environment: IntelliJ IDEA

Testing framework: JUnit 5 (Jupiter API).

Build tool: Maven (optional) or manual configuration of the JUnit JAR.

Required dependencies (if using Maven):
Include in your `pom.xml` file:
```xml
    <dependencies>
     <dependency>
     <groupId>org.junit.jupiter</groupId>
     <artifactId>junit-jupiter</artifactId>
     <version>5.9.3</version>
     <scope>test</scope>
     </dependency>
    </dependencies>
```
If you don't use Maven, download the JAR file from Maven Central and manually add it to the project.

#How to run it

1. **Clone or download the repository**:
- Clone the repository:
```bash
git clone https://github.com/your-repository/testing-junit.git
```
- Or download the ZIP file and extract the contents.

2. **Open the project**:
- Use your favorite IDE (such as IntelliJ IDEA or Eclipse).
- Make sure the project is set up correctly and that the dependencies (if you use Maven) are downloaded automatically.

3. **Run the tests**:
- From the IDE:
- Right-click on any test class or the `/src/test/java` package.
- Select the "Run Tests" option.
- From the terminal:
- If you are using Maven, run:
```bash
mvn test
```

4. **View the results**:
- The test results will appear in the IDE console or the terminal, indicating which tests passed and which failed.

#Contribution

Contributions are welcome! Please follow these steps to contribute:

-Fork the repository
-Create a new branch git checkout
-b feature/NewFeature
-Make your changes and commit them: git commit
-m 'Add New Feature'
-Upload the changes to your branch: git push origin feature/NewFeature
-Make a pull request