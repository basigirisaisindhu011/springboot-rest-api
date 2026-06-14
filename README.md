# Spring Boot REST API

A beginner-friendly Spring Boot REST API project demonstrating how to build RESTful web services using various HTTP methods and Spring MVC annotations.

## Features

* GET API
* POST API
* PUT API
* DELETE API
* Path Variables
* Request Parameters
* Request Body Handling
* ResponseEntity Usage
* JSON Request and Response Processing

## Technologies Used

* Java
* Spring Boot
* Spring Web
* Maven

## Project Structure

```
src
 └── main
      └── java
           └── com.practice.springboot_api
                ├── controller
                │     └── StudentController.java
                └── bean
                      └── Student.java
```

## API Endpoints

### 1. Get Single Student

**Request**

```
GET /student
```

**Response**

```json
{
  "id": 1,
  "firstname": "Sai",
  "lastname": "Sindhu"
}
```

---

### 2. Get All Students

**Request**

```
GET /students
```

**Response**

```json
[
  {
    "id": 1,
    "firstname": "Sai",
    "lastname": "Sindhu"
  },
  {
    "id": 2,
    "firstname": "Harish",
    "lastname": "Kumar"
  }
]
```

---

### 3. Path Variable Example

**Request**

```
GET /students/1/Sai/Sindhu
```

**Response**

```json
{
  "id": 1,
  "firstname": "Sai",
  "lastname": "Sindhu"
}
```

---

### 4. Request Parameter Example

**Request**

```
GET /students/query?id=1&firstname=Sai&lastname=Sindhu
```

**Response**

```json
{
  "id": 1,
  "firstname": "Sai",
  "lastname": "Sindhu"
}
```

---

### 5. Create Student

**Request**

```
POST /students/create
```

**Request Body**

```json
{
  "id": 1,
  "firstname": "Sai",
  "lastname": "Sindhu"
}
```

---

### 6. Update Student

**Request**

```
PUT /students/1/update
```

**Request Body**

```json
{
  "id": 1,
  "firstname": "Updated",
  "lastname": "Student"
}
```

---

### 7. Delete Student

**Request**

```
DELETE /student/1/delete
```

**Response**

```
Student deleted successfully
```

## Running the Application

### Clone Repository

```bash
git clone https://github.com/basigirisaisindhu011/springboot-rest-api.git
cd springboot-rest-api
```

### Run Application

```bash
./mvnw spring-boot:run
```

Windows:

```cmd
mvnw.cmd spring-boot:run
```

The application starts on:

```
http://localhost:8080
```

## Learning Objectives

This project was created to practice:

* REST API Development
* Spring Boot Fundamentals
* HTTP Methods (GET, POST, PUT, DELETE)
* Request Mapping
* Path Variables
* Query Parameters
* JSON Serialization and Deserialization
* ResponseEntity

## Author

Sindhu

## License

This project is created for learning and educational purposes.
