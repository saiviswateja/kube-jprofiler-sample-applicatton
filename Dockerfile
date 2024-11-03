# Use an official Java JDK image as a parent image
FROM openjdk:11-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the Java file into the container
COPY HelloWorld.java .

# Compile the Java application
RUN javac HelloWorld.java

# Run the application
CMD ["java", "HelloWorld"]
