Of course! Here is a **clean and final README.md** version **without screenshots section** — ready to upload to GitHub 👇
(You can add images later)

---

## 📌 Employee Management REST API (Spring Boot)

A complete backend application to manage **Employees** & **Departments** using REST APIs in Spring Boot with H2 Database.

---

## 🚀 Features

✔ CRUD for Department
✔ CRUD for Employee
✔ Assign employees to departments
✔ Uses Spring Data JPA & Hibernate
✔ In-memory H2 database for testing
✔ Clean layered architecture
✔ Tested using Postman

---

## 🛠️ Technology Stack

| Category  | Technology                            |
| --------- | ------------------------------------- |
| Language  | Java 21                               |
| Framework | Spring Boot 3.4                       |
| ORM       | Spring Data JPA + Hibernate           |
| Database  | H2 (In-Memory)                        |
| Tools     | Maven, Git, Postman, VS Code/IntelliJ |

---

## 🏗️ Project Structure

```
src/main/java/com/example/employeeapp
│
├── controller        ➝ API request handlers
├── service           ➝ Business logic
│   └── impl
├── repository        ➝ JPA repositories
├── entity            ➝ Database tables
└── EmployeeappApplication.java
```

---

## 🔗 REST API Endpoints

### 🏢 Department

| METHOD | ENDPOINT                | DESCRIPTION          |
| ------ | ----------------------- | -------------------- |
| POST   | `/api/departments`      | Create department    |
| GET    | `/api/departments`      | Get all departments  |
| GET    | `/api/departments/{id}` | Get department by ID |
| PUT    | `/api/departments/{id}` | Update department    |
| DELETE | `/api/departments/{id}` | Delete department    |

---

### 👨‍💼 Employee

| METHOD | ENDPOINT                        | DESCRIPTION                        |
| ------ | ------------------------------- | ---------------------------------- |
| POST   | `/api/employees/{departmentId}` | Create employee under a department |
| GET    | `/api/employees`                | Get all employees                  |
| GET    | `/api/employees/{id}`           | Get employee by ID                 |
| PUT    | `/api/employees/{id}`           | Update employee                    |
| DELETE | `/api/employees/{id}`           | Delete employee                    |

---

## ▶️ Running the Application

### Using Maven

```sh
# Clone the repository
git clone https://github.com/your-username/employeeapp-backend.git
cd employeeapp-backend

# Run the application
mvn spring-boot:run
```

Server runs at:
🔗 [http://localhost:8080](http://localhost:8080)

---

## 🧪 H2 Database Console

🔗 [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

| Property | Value                |
| -------- | -------------------- |
| JDBC URL | `jdbc:h2:mem:testdb` |
| Username | `sa`                 |
| Password | *(empty)*            |

---

## 🔮 Future Enhancements

* Add JWT Authentication
* Switch DB to MySQL or PostgreSQL
* Swagger API documentation
* Pagination and Sorting
* Docker support

---

## 👩‍💻 Developed By

**Ramya** — Java Backend Developer
📍 Passionate about Spring Boot & REST APIs

🌟 *If you like this project, please give it a Star!* ⭐

