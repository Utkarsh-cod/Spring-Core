# ✈️ Flight Booking Application (Spring MVC)

A simple Flight Booking web application developed while learning Spring MVC. The application allows users to select a source and destination city, search for available flights, and view matching flight details.

The project focuses on understanding the Spring MVC architecture and how different layers of a web application interact with each other.

---

## 📁 Source Code Location

The complete source code is available in:

```
FlightBookingApplication
└── src
    └── main
        └── java
            └── com
                └── example
                    └── FlightBookingApplication
```

---

## 🚀 Features

- Search flights based on source and destination
- Displays all matching flights
- In-memory flight database using Java Collections
- Web interface built using JSP
- Layered Spring MVC architecture

---

## 🏗️ Project Architecture

```
Browser
    │
    ▼
Controller
    │
    ▼
Service
    │
    ▼
Repository
    │
    ▼
Flight Data (In-Memory)
```

---

## 📂 Project Structure

```
FlightBookingApplication
│
├── Controller
├── Service
├── Repository
├── Database
├── Entity
└── JSP Views
```

---

## 🔄 Request Flow

1. User opens the application.
2. Spring loads the search page.
3. User selects source and destination.
4. The form sends a POST request to the controller.
5. The controller receives the request.
6. The service filters available flights.
7. The repository retrieves flight data.
8. Matching flights are returned to the controller.
9. The controller sends the data to the JSP page using the Model object.
10. The result page displays all matching flights.

---

## 🧩 Spring Concepts Demonstrated

- Spring MVC
- Controller
- Service Layer
- Repository Layer
- Dependency Injection
- Component Scanning
- Model Object
- Request Mapping
- Request Parameters
- JSP View Resolver
- Layered Architecture

---

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring MVC
- JSP
- Maven
- Eclipse IDE

---

## 📖 Concepts Learned

This project helped me understand:

- MVC Architecture
- Flow of an HTTP Request
- Controller → Service → Repository communication
- Handling HTML forms in Spring MVC
- Passing data using the Model object
- Displaying dynamic content using JSP
- In-memory data handling using Java Collections

---

## 📈 Future Improvements

- Integrate MySQL database
- Use Spring Data JPA
- Add Flight Booking functionality
- Add Passenger Details
- Implement Authentication & Authorization
- Improve UI using Bootstrap

---

## Sample Workflow

```
Home Page

↓

Select Source & Destination

↓

Click Search

↓

Controller Receives Request

↓

Service Filters Flights

↓

Repository Retrieves Data

↓

Results Displayed on JSP
```

---

## 💡 Note

This project was developed as part of my Spring learning journey to understand Spring MVC, layered architecture, request handling, and JSP-based web applications before moving to REST APIs and database integration.