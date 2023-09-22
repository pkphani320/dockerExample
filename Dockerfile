FROM eclipse-temurin:17
COPY target/dockerExample.jar dockerExample.jar
CMD [ "java","-jar","dockerExample.jar"]