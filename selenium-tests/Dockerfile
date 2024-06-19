# Use the official Maven image with JDK 17
FROM maven:3.8.5-openjdk-17

# Set the working directory
WORKDIR /usr/src/selenium-tests

# Copy the pom.xml and source code
COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src

# Package the application
RUN mvn package

# Default command to run your tests
CMD ["mvn", "test"]

