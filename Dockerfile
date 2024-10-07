FROM openjdk:22-jdk-slim

WORKDIR /src/main/java

COPY target/HelloWorld.jar Main.jar

ENTRYPOINT ["java", "-jar", "Main.jar"]