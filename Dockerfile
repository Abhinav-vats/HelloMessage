FROM openjdk:8
ADD target/hello-message.jar hello-message.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar", "hello-message.jar"]