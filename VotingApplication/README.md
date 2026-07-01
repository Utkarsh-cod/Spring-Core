# 🗳️ Voting Application (Spring Core)

A console-based Voting Application developed to practice and understand the core concepts of the Spring Framework.

The application allows users to cast votes for different political parties, while an administrator can view all recorded votes. The project focuses on understanding Spring Core rather than building a production-ready application.

---

## 🚀 Features

- Register multiple users
- Vote for a political party
- View all recorded votes
- In-memory data storage using collections
- Console-based interaction

---

## 🧩 Spring Concepts Demonstrated

- ✅ Spring IoC Container
- ✅ Component Scanning (`@Component`)
- ✅ Bean Scopes
  - Singleton
  - Prototype
- ✅ Bean Lifecycle
  - `@PostConstruct`
  - `@PreDestroy`
- ✅ Manual Dependency Injection
- ✅ Interfaces & Loose Coupling
- ✅ Object Relationships (HAS-A)
- ✅ Collection Handling

---

## 🏗️ Project Structure

```
VotingApplication
│
├── PoliticalParty
│   ├── BJP
│   ├── INC
│   └── AAP
│
├── User
│   └── SimpleUser
│
├── UserList
│   └── SimpleUserList
│
├── Authority
│   └── AuthorityCounter
│
└── VotingApplication (Main Class)
```

---

## 🔄 Working Flow

1. User enters their name.
2. User selects a political party.
3. A new `SimpleUser` object (Prototype Bean) is created.
4. The selected party is assigned to the user.
5. The user is added to the common `UserList`.
6. The administrator can view all recorded votes.

---

## 🛠️ Technologies Used

- Java 17
- Spring Boot
- Spring Core
- Maven
- Eclipse IDE

---

## 📖 Concepts Learned

This project helped me understand:

- Inversion of Control (IoC)
- Bean Management
- Singleton vs Prototype Scope
- Component Scanning
- Bean Lifecycle
- Interfaces and Polymorphism
- Loose Coupling
- Object-Oriented Design

---

## 📌 Future Improvements

- Store votes in a database (MySQL)
- Build a REST API using Spring Boot
- Create a web interface
- Add vote counting and result statistics
- Implement user authentication

---

### 📷 Sample Output

```
Enter Your Choice

1. Vote
2. View Votes
0. Exit

Enter Your Name
Utkarsh

Choose Political Party
1. BJP
2. INC
3. AAP

Vote Recorded Successfully!

Admin View

Utkarsh Voted For : Bhartiya Janta Party
Rahul Voted For : Indian National Congress
```

---

> **Note:** This project was developed as part of my Spring Core learning journey to strengthen my understanding of the framework's fundamental concepts.