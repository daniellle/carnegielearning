# Prerequisites
In order to run this application it is necessary to meet some basic requirements.
- Java 9+
- Maven 3.3+

# Compiling and initializing
As with every *Maven* project, it is necessary to first generate the sources. As per the example below:
```bash
mvn clean install
```

Make sure the Maven repository is correctly configured. After the sources have been generated, just run the command below to start the application:
```
$ java -jar target/nextproblem-0.0.1-SNAPSHOT.jar
```

# Exposed endpoints
Once the project is running, you can check the exposed APIs by going to the URL:
```
http://localhost:8080/v1/problem/next
```
- REQUEST

```
{
    "studentId": "1",
    "problems": ["PRO1"]
}
```