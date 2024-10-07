FROM openjdk:22-jdk-slim

WORKDIR /src/main/java

COPY target/HelloWorld-0.0.1-SNAPSHOT.jar /src/main/java/Main.java

CMD ["java", "-jar", "Main.java"]