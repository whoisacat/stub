FROM eclipse-temurin:21-jdk-alpine as blocker_admin_app

ENV PROJECT_DIR=/opt/project
RUN mkdir -p $PROJECT_DIR
WORKDIR $PROJECT_DIR

COPY ./build/libs/app.jar $PROJECT_DIR/app.jar

EXPOSE 49999

ENTRYPOINT ["java", "-jar", "/opt/project/app.jar"]
