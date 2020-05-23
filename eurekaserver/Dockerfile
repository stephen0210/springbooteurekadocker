FROM gradle:4.10.0-jdk8-alpine AS build
COPY --chown=gradle:gradle . /home/gradle/src/eurekaserver
WORKDIR /home/gradle/src/eurekaserver
RUN gradle build --no-daemon --stacktrace
RUN gradle bootJar --no-daemon --stacktrace
FROM openjdk:8-jdk-alpine
ARG JAR_FILE=build/libs/*.jar
COPY --from=build /home/gradle/src/eurekaserver/build/libs/*.jar eurekaserver.jar
ENTRYPOINT ["java","-jar","/eurekaserver.jar"]