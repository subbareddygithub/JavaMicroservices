FROM openjdk:11
EXPOSE 8080
#ADD target/springboot-backend springboot-backend
ENTRYPOINT ["java", "-jar", "springboot-backend"]
