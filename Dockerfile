#FROM openjdk:17
#EXPOSE 8085
#ADD target/springboot-project.jar springboot-project.jar
#ENTRYPOINT ["java","-jar","/springboot-project.jar"]

FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]