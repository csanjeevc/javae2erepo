# Base image with Java
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy the JAR file into container
COPY target/sanjeev25dec_ms_java-0.0.1-SNAPSHOT.jar app.jar


# Expose application port
EXPOSE 8081

# Run the application
ENTRYPOINT ["java","-jar","app.jar"]
