**Overview**
This repository contains a Spring Boot application that serves as a backend for Assessment test application.
It includes RESTful APIs designed to Add subject, add student, get all subjects, get all students. A Postman collection is also provided to help you test and interact with the API endpoints.

**Technologies Used**
- **Spring Boot**: 3.0.1
- **Spring Data JPA**
- **Spring Security**: 3
- **Database**: H2
- **Postman**: 2.0

**Prerequisites**

- Java 21 or higher
- Maven 4.0.0 or higher

**Usage**
Once the application is running, you can access the API endpoints at `http://localhost:8080`.
For a list of available endpoints,  check the Postman collection.

**Notes**
- The application contains backend part only.
- I was able to configure authentication part but failed to configure authorization part. So it'll hit any endpoint without authentication and authorization by bypassing spring security.
- Due to concerns mentioned above, I was unable to implement JWT.
- Working parts :
  **adding student**,
  **adding subject**,
  **get all students**,
  **get all subjects**,
- It is connected to H2 database so data will lost when application is stopped.
