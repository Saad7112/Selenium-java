FROM maven:3.8.4-openjdk-11

WORKDIR /usr/src/selenium-tests

COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src

CMD ["mvn", "test"]

