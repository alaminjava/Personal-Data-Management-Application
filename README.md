# Personal Data Management Application

This is a full-stack Java Spring Boot application that provides both a REST API and a web-based interface to manage personal data.

## Features
- Add, view, edit, and delete personal data such as name, email, and age.
- REST API for CRUD operations.
- Web interface built with Thymeleaf for easy interaction.

## Technologies Used
- **Backend**: Spring Boot, Spring Data JPA
- **Frontend**: Thymeleaf, HTML, CSS
- **Database**: MySQL (or H2 for in-memory testing)

## How to Run

### Prerequisites:
- JDK 11+
- Maven
- MySQL (optional for database)

### Steps to Run:
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/personal-data-management.git
   cd personal-data-management


REST API Endpoints:
GET /api/v1/persons — Retrieve all personal data records.
GET /api/v1/persons/{id} — Retrieve a specific record by ID.
POST /api/v1/persons — Add a new record.
PUT /api/v1/persons/{id} — Update an existing record by ID.
DELETE /api/v1/persons/{id} — Delete a record by ID.


REST API Endpoints:
GET /api/v1/persons — Retrieve all personal data records.
GET /api/v1/persons/{id} — Retrieve a specific record by ID.
POST /api/v1/persons — Add a new record.
PUT /api/v1/persons/{id} — Update an existing record by ID.
DELETE /api/v1/persons/{id} — Delete a record by ID.



Example API Usage
Add a New Person:

curl -X POST http://localhost:8080/api/v1/persons \
-H "Content-Type: application/json" \
-d '{"name":"John Doe", "email":"john.doe@example.com", "age":30}'


Get All Persons:

curl http://localhost:8080/api/v1/persons
