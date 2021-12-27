FROM openjdk:17
EXPOSE 8080
ADD target/guestbook.jar guestbook.jar
ENTRYPOINT ["java", "-jar", "/guestbook.jar"]