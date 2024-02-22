FROM openjdk:17
EXPOSE 8080
ADD target/docker-maven.jar docker-maven.jar
ENTRYPOINT ["java","-jar","docker-maven.jar"]