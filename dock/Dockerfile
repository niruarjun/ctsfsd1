FROM openjdk:8-jre-alpine
COPY target/dock-0.0.1-SNAPSHOT.jar /usr/share
WORKDIR /usr/share
ENTRYPOINT ["java","-cp", "dock-0.0.1-SNAPSHOT.jar", "docker.dock.App"]