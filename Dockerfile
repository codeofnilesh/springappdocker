FROM openjdk:21

COPY target/spring-boot-docker-app.jar /usr/app/

WORKDIR /usr/app

EXPOSE 9595

ENTRYPOINT ["java", "-jar", "spring-boot-docker-app.jar"]
