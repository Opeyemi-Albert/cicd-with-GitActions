FROM openjdk:17
EXPOSE 8085
ADD target/springboot-project.jar springboot-project.jar
ENTRYPOINT ["java","-jar","/springboot-project.jar"]