# 🎉 Event Management Application

![Angular](https://img.shields.io/badge/Angular-17-red)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.0-brightgreen)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)
![AWS](https://img.shields.io/badge/AWS-Deployed-orange)
![Docker](https://img.shields.io/badge/Docker-Enabled-blue)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

A **scalable web-based event management system** built with **Angular 17**, **Spring Boot**, and **MySQL**, designed to manage event scheduling, registration, ticketing, and analytics for both users and organizers.  
The application focuses on **high availability, error monitoring, and seamless user experience**, deployed with **Docker** on **AWS** infrastructure.

---

## 🚀 Features

- 📅 **Event Management:** Create, edit, and delete events with custom schedules and categories.  
- 👥 **User Roles:** Separate dashboards for Admins, Organizers, and Attendees.  
- 🎟️ **Ticketing System:** Booking, cancellation, and real-time seat availability.  
- 📊 **Analytics Dashboard:** Insights on attendee count, revenue, and feedback trends.  
- 🔐 **Authentication:** JWT-based login and role-based authorization.  
- ☁️ **Cloud Deployment:** Backend on AWS EC2, Frontend on AWS S3 + CloudFront.  
- 🧠 **Error Monitoring:** Logs and alerts integrated using CloudWatch and Docker health checks.

---

## 🧱 Architecture Overview

```mermaid
flowchart TD
    A[Angular Frontend] -->|HTTP Requests| B[API Gateway - Spring Boot]
    B --> C1[Event Service]
    B --> C2[User Service]
    B --> C3[Analytics Service]
    C1 --> D1[(MySQL Database)]
    C2 --> D2[(MySQL Database)]
    C3 --> D3[(CloudWatch Logs / Reports)]
