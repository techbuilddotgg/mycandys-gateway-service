# Use OpenJDK 17 as base image
FROM openjdk:17-alpine

# Set environment variables for the Spring Boot app
ENV PORT='8080'
ENV AUTH_SERVICE_URI='auth_service_uri'

# Create app directory
RUN mkdir /app

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY ./target/mycandys-gateway-service-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose the port the app runs on
EXPOSE ${PORT}

# Command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "/app/app.jar"]
