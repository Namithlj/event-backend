# Use official Java image
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy built JAR from Maven target
COPY target/*.jar app.jar

# Expose application port (Render sets $PORT)
EXPOSE 8080

# Start Spring Boot using Render-provided port
ENTRYPOINT ["java","-Dserver.port=${PORT}","-jar","app.jar"]
