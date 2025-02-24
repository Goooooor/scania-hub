# Scania Hub

Scania Hub is a web application for searching and comparing Scania vehicles, built with React (frontend) and Spring Boot (backend) using Gradle.

## Features

- Search for trucks and buses
- Apply filters like series, engine type, automatic transmission, and production status
- Compare multiple vehicles in a table

## Technologies Used

- **Frontend:** JavaScript, React, Vite, MUI, MobX
- **Backend:** Java 17+, Spring Boot, Gradle

## Getting Started

### Prerequisites

- **Frontend:** Node.js installed
- **Backend:** Java 17+ installed

### Installation and Running
If your backend is running on a different port, update the frontend configuration in api-config.js, as API calls are set to use port 8080 by default.


```sh
cd frontend\src
npm install
npm run dev


cd backend
./gradlew bootRun  # For Linux/macOS
gradlew.bat bootRun  # For Windows
