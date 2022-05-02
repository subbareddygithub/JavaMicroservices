FROM openjdk:11
EXPOSE 8080
ADD target/cloud_demo.jar cloud_demo.jar
ENTRYPOINT ["java", "-jar", "cloud_demo.jar"]
