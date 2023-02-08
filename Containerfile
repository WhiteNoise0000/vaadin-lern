FROM docker.io/eclipse-temurin:17-jre
LABEL LABEL org.label-schema.name="vaadin-lern"
EXPOSE 8080
COPY build/libs/vaadin-lern.jar vaadin-lern.jar
RUN groupadd -r app && useradd -r -g app app
USER app
ENTRYPOINT ["java","-jar","/vaadin-lern.jar"]