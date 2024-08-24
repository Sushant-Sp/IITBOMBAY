FROM openjdk:17
EXPOSE 8080
COPY target/iitb-assignment.jar iitb-assignment.jar
ENTRYPOINT ["java","-jar","/iitb-assignment.jar"]