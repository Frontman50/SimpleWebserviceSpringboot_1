FROM maven:3.8.3-openjdk-17 AS MAVEN_TOOL_CHAIN
COPY pom.xml /tmp/
COPY . /tmp/
WORKDIR /tmp/

RUN mvn clean install

FROM eclipse-temurin:17-jre

RUN apt update -yqq && apt upgrade -yqq && \
    apt-get autoremove -y && apt-get clean && rm -rf /var/lib/apt/lists/

WORKDIR /opt/leoooooo
COPY --from=MAVEN_TOOL_CHAIN /tmp/target/*.jar ./leoooooo.jar


ARG VERSION=2.1.0
ENV APP_VERSION=${VERSION}
ENV TEST_WEBSERVICE_PORT="9090"


EXPOSE 9090

ENTRYPOINT ["java", "-jar", "target/leoooooo.jar"]