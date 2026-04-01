# Step 1: Use a lightweight JRE image
FROM eclipse-temurin:17-jre-alpine

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Copy your jar file into the container
# We rename it to 'app.jar' for simplicity in the ENTRYPOINT
COPY IReadBooks-0.0.1-SNAPSHOT.jar app.jar

# Step 4: Expose the port your app runs on (usually 8080 for Spring Boot)
EXPOSE 8080

# Step 5: Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]