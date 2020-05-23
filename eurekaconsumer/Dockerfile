FROM gradle:4.10.0-jdk8-alpine AS build
COPY --chown=gradle:gradle . /home/gradle/src/eurekaconsumer
WORKDIR /home/gradle/src/eurekaconsumer
RUN gradle build --no-daemon --stacktrace
RUN gradle bootJar --no-daemon --stacktrace
FROM openjdk:8-jdk-alpine
ARG JAR_FILE=build/libs/*.jar
COPY --from=build /home/gradle/src/eurekaconsumer/build/libs/*.jar eurekaconsumer.jar
ENTRYPOINT ["java","-jar","/eurekaconsumer.jar"]