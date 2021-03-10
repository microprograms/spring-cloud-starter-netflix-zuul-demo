FROM openjdk:8-jre
ADD target/*.jar app.jar
EXPOSE 5555
ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar" ]