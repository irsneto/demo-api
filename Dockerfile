FROM gradle:latest-alpine AS builder
COPY . .
RUN ./gradlew build
COPY build/libs/*SNAPSHOT.jar app.jar

FROM openjdk:11
WORKDIR /jarapp
COPY --from=builder . ./
ENTRYPOINT ["java", "-jar", "app.jar"]
