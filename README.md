# Hospital Microservices

This is a demo healthcare microservices project built with Spring Boot. It includes:

## 🧱 Services

| Service Name     | Description                        | Port |
|------------------|------------------------------------|------|
| Config Server    | Centralized configuration manager  | 8888 |
| Eureka Server    | Service registry and discovery     | 8761 |
| API Gateway      | Entry point with routing           | 8080 |
| Hospital Service | Sample microservice (DB example)   | 8081 |

## 🔧 Tech Stack

- Java 17
- Spring Boot
- Spring Cloud (Eureka, Config, Gateway)
- Maven
- MySQL
- Git

## 🚀 How to Run

1. Start `config-server`
2. Start `eureka-server`
3. Start `hospital-service`
4. Start `api-gateway`

All configs are pulled dynamically from the [Config Repo](https://github.com/sravanikarre/hospital-config-repo.git))

## 🗃️ Directory Structure

