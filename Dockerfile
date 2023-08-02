# Use a base image with the Java runtime (JRE)
FROM openjdk:11

# Set the working directory inside the container
WORKDIR /app

# Copy the executable JAR to the container
COPY ./target/AssignmentProject-0.0.1-SNAPSHOT.jar ./AssignmentProject-0.0.1-SNAPSHOT.jar

# Run the JAR file when the container starts
CMD ["java", "-jar", "AssignmentProject-0.0.1-SNAPSHOT.jar"]