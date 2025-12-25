FROM eclipse-temurin:17-jdk
# Set working directory
WORKDIR /app
# Copy the JAR file into container
COPY target/java_e2e-0.0.1-SNAPSHOT.jar app.jar
# Expose application port
EXPOSE 8080
# Run the application
ENTRYPOINT ["java","-jar","app.jar"]
