# Use a base image with Java installed
FROM openjdk:21-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged Spring Boot application JAR file into the container
COPY target/dockerandk8s-0.0.1-SNAPSHOT.war dockerandk8s-0.0.1-SNAPSHOT.war

# Expose the port that your Spring Boot application runs on
EXPOSE 8080

# Command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "dockerandk8s-0.0.1-SNAPSHOT.war"]
