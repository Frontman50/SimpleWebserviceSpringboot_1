FROM maven:3.8.3-openjdk-17 AS MAVEN_TOOL_CHAIN
COPY pom.xml /tmp/
COPY . /tmp/
WORKDIR /tmp/


RUN mvn clean install


EXPOSE 9090

ENTRYPOINT ["java", "-jar", "target/leoooooo-1.0.jar"]