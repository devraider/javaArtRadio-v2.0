# Use the official OpenJDK image for Java 17 as the base image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven build file
COPY mvnw .
COPY .mvn .mvn

# Copy the pom.xml file and install dependencies
COPY pom.xml .
RUN ./mvnw dependency:go-offline

# Copy the source code into the container
COPY src src

# Build the application
RUN ./mvnw package -DskipTests

# Your application's jar file is named radio-0.0.1-SNAPSHOT.jar
# Update the ENTRYPOINT to use this jar file
ENTRYPOINT ["java","-jar","target/radio-0.0.1-SNAPSHOT.jar"]
EXPOSE 8085
