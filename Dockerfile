FROM openjdk:17
add target/*.jar logger.jar
ENTRYPOINT ["java","-jar","logger.jar"]
