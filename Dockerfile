FROM openjdk:8
VOLUME /tmp
EXPOSE 8085
ADD ./target/springboot-servicio-docker-api-0.0.1-SNAPSHOT.jar servicio-docker-prueba.jar
ENTRYPOINT ["java","-jar","/servicio-docker-prueba.jar"]