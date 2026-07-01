# 🗳️ Voting Application (Spring Core)

A console-based Voting Application developed using Spring Core to understand the fundamental concepts of the Spring Framework. The project demonstrates how Spring manages objects, dependencies, bean scopes, and lifecycle through a simple voting system.

---

## 📁 Source Code Location

The complete source code is located in the following directory:

```
VotingApplication
└── src
    └── main
        └── java
            └── com
                └── example
                    └── VotingApplication
```

---

## 🚀 Features

- Register multiple users
- Vote for a political party
- Display all recorded votes
- In-memory storage using collections
- Console-based application

---

## 🧩 Spring Concepts Demonstrated

- Spring IoC Container
- Component Scanning (`@Component`)
- Bean Scopes
  - Singleton
  - Prototype
- Bean Lifecycle
  - `@PostConstruct`
  - `@PreDestroy`
- Manual Dependency Injection
- Interfaces & Loose Coupling
- HAS-A Relationship
- Collections in Spring

---

## 🏗️ Project Structure

```
PoliticalParty
├── BJP
├── INC
└── AAP

User
└── SimpleUser

UserList
└── SimpleUserList

Authority
└── AuthorityCounter

VotingApplication
└── Main Class
```

---

## 🔄 Working Flow

1. The user enters their name.
2. The user selects a political party.
3. Spring creates a new `SimpleUser` (Prototype Bean).
4. The selected political party is assigned to the user.
5. The user is stored in a common `UserList` (Singleton Bean).
6. The administrator can view all recorded votes.

---

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring Core
- Maven
- Eclipse IDE

---

## 📖 Concepts Learned

This project helped me understand:

- Spring IoC (Inversion of Control)
- Bean Management
- Component Scanning
- Singleton & Prototype Bean Scope
- Bean Lifecycle
- Dependency Injection
- Interfaces & Polymorphism
- Loose Coupling
- Object-Oriented Design

---

## 📈 Future Improvements

- Store data in MySQL
- Develop REST APIs using Spring Boot
- Create a web interface
- Add vote counting statistics
- Implement user authentication

---

## Sample Console Output

```
Enter Your Choice

1. Vote (User)
2. View Votes (Admin)
0. Exit

Enter Your Name
Utkarsh

Choose The Political Party

1. BJP
2. INC
3. AAP

Vote Recorded Successfully!

Admin View

Utkarsh Voted For : Bhartiya Janta Party
Rahul Voted For : Indian National Congress
```

---

## 💡 Note

This project was developed as a learning exercise to practice Spring Core concepts and understand how Spring manages objects, dependencies, bean scopes, and bean lifecycle in a console-based application.
