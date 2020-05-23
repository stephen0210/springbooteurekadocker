FROM gradle:4.10.0-jdk8-alpine AS build
COPY --chown=gradle:gradle . /home/gradle/src/eurekaproducer
WORKDIR /home/gradle/src/eurekaproducer
##RUN gradle build --no-daemon --stacktrace
RUN gradle bootJar --no-daemon --stacktrace
FROM openjdk:8-jdk-alpine
ARG JAR_FILE=build/libs/*.jar
COPY --from=build /home/gradle/src/eurekaproducer/build/libs/*.jar eurekaproducer.jar
ENTRYPOINT ["java","-jar","/eurekaproducer.jar"]