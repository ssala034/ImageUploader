# ImageUploader  
> A simple app for uploading and signing images and files, with AWS S3 storage and Postgresql database integration.

## Demo   
![ImageUploader Screenshot](https://github.com/user-attachments/assets/e441f930-b4ca-4541-bfec-6fa0f41e3968) <!-- Replace with your actual image URL -->

## Overview  

**ImageUploader** is a web application designed for users to easily sign and upload images or other files to a cloud-based storage (AWS S3). The application is built using **Spring Boot** for the backend and **React** for the frontend. The file metadata is stored in a **PostgreSQL database**. It also provides Docker deployment capabilities for easy environment setup.

Key features:
- **User Authentication** – Users can sign in and upload images/files securely.
- **AWS S3 Integration** – Images and files are uploaded and stored in AWS S3.
- **PostgreSQL Database** – Stores file metadata and user info.
- **Docker Deployment** – Simplified setup for development, testing, and production environments.

## Tech Stack  

- **Frontend**:
  - [![React](https://img.shields.io/badge/React-%2320232a.svg?logo=react&logoColor=%2361DAFB)](https://reactjs.org/)
  
- **Backend**:
  - [![Spring Boot](https://img.shields.io/badge/Spring%20Boot-%236DB33F.svg?logo=spring&logoColor=white)](https://spring.io/projects/spring-boot)
  - [![PostgreSQL](https://img.shields.io/badge/PostgreSQL-%23316192.svg?logo=postgresql&logoColor=white)](https://www.postgresql.org/)
  - [![AWS S3](https://img.shields.io/badge/AWS%20S3-%23FF9900.svg?logo=amazonaws&logoColor=white)](https://aws.amazon.com/s3/)
  
- **Deployment**:
  - [![Docker](https://img.shields.io/badge/Docker-%232496ED.svg?logo=docker&logoColor=white)](https://www.docker.com/)

## Features

- 📂 **Image and File Upload** – Easily upload and store images and other files.
- 📝 **User Sign In** – Secure user authentication to manage uploads.
- 💾 **AWS S3 Storage** – Images and files are stored on AWS S3, ensuring scalability and security.
- 🗄️ **PostgreSQL Database** – Metadata like filenames and user information are saved in a PostgreSQL database.
- 🚀 **Docker-Ready** – The app is containerized with Docker for easy deployment.

## Getting Started 🚀  

To set up the project locally, follow these steps:

### 1. Clone the repository:
```bash
git clone https://github.com/yourusername/image-uploader.git
cd ImageUploader
```

2. Install dependencies for React frontend 
Navigate to the frontend directory and install dependencies:

```bash
cd frontend
npm install
```

4. Set up the Backend (Spring Boot):
Navigate to the backend directory and install the required dependencies for the Spring Boot application:

```bash
cd backend
./mvnw install
```
Make sure to configure your AWS S3 and PostgreSQL settings in the application.properties or .env file. You'll need to add your AWS access keys and PostgreSQL database credentials.

6. Run the Application Locally:
Frontend:

```bash
cd frontend
npm run dev
```
Backend (Spring Boot):

```bash
cd backend
./mvnw spring-boot:run
```
The app should now be running on your local machine.
