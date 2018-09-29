#基础镜像也可以用 java:8
FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD user-web-0.0.1-SNAPSHOT.jar app.jar
RUN echo "Asia/shanghai" > /etc/timezone
ENTRYPOINT ["java","-Xmx1024m","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 9020