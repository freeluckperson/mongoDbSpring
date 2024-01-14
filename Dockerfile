FROM amazoncorretto:21-alpine-jdk

COPY target/mongoDbSpring-0.0.1-SNAPSHOT.jar mongoApp.jar

ENTRYPOINT ["java", "-jar", "mongoApp.jar"]