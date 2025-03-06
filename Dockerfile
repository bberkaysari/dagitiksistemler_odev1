FROM openjdk:17-jdk-slim

WORKDIR /app

COPY /app/target/app-1.0.0.jar /app/app.jar

CMD ["java", "-jar", "/app/app.jar"]