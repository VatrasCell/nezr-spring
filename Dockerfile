FROM openjdk:11-jre-slim
ADD target/nezr-spring-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
#, "-web -webAllowOthers -tcp -tcpAllowOthers -browser"
#EXPOSE 8080