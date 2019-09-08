FROM java:8
EXPOSE 27000
ADD /target/deal-service-0.0.1-SNAPSHOT.jar deal-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "deal-service-0.0.1-SNAPSHOT.jar"]