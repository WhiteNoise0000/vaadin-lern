FROM docker.io/eclipse-temurin:17-jdk-alpine
COPY build/libs/vaadin-lern.jar vaadin-lern.jar
ENTRYPOINT ["java","-jar","/vaadin-lern.jar"]