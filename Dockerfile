FROM openjdk:17
EXPOSE 8080
ADD target/githubactiondemo.jar githubactiondemo.jar
ENTRYPOINT ["java","-jar","/githubactiondemo.jar"]
ENTRYPOINT ["java","-jar","/githubactiondemo.jar"]