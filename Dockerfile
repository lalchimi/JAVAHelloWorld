FROM openjdk:22-jdk-slim

WORKDIR /app

COPY target/HelloWorld-0.0.1-SNAPSHOT.jar /app/Main.jar

CMD ["java", "-jar", "Main.jar"]