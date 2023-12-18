# Build Stage
FROM gradle:7.2.0-jdk17 AS build

WORKDIR /app

# Copy only the necessary files
COPY build.gradle settings.gradle ./
COPY src ./src

# Build the application
RUN gradle clean build

# Runtime Stage
FROM tomcat:9.0.56-jdk17-openjdk-slim

WORKDIR /usr/local/tomcat/webapps

# Copy the built WAR file from the build stage
COPY --from=build /app/build/libs/mybatis-0.0.1-SNAPSHOT.war ./ROOT.war

EXPOSE 8080
CMD ["catalina.sh", "run"]