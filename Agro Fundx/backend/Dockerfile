FROM maven:3.8.5-openjdk-17 AS build
COPY . .
RUN man clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build/target/kavya-0.0.1-SNAPSHOT.jar deploy.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","deploy.jar"]