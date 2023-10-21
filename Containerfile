FROM docker.io/eclipse-temurin:17-jre
LABEL LABEL org.label-schema.name="vaadin-lern"
EXPOSE 8080
COPY build/libs/vaadin-lern.jar vaadin-lern.jar
RUN groupadd -r app && useradd -r -g app app

# ロケールの設定
RUN locale-gen ja_JP.UTF-8
ENV LC_ALL ja_JP.UTF-8
ENV LANG ja_JP.UTF-8
ENV LANGUAGE ja_JP:UTF-8

USER app
ENTRYPOINT ["java","-jar","/vaadin-lern.jar"]
