FROM brijeshw/ubuntu1404oraclejdk8

MAINTAINER Brijesh Walia "https://hub.docker.com/r/brijeshw"

VOLUME /tmp

RUN git clone https://github.com/brijeshw/test-springboot-accountservice.git

RUN mkdir /microservice

RUN cp -R test-springboot-accountservice /microservice

RUN mvn -f /test-springboot-accountservice/test-springboot-accountservice/pom.xml package

EXPOSE 8080

RUN sh -c 'touch  /test-springboot-accountservice/test-springboot-accountservice/target/test-springboot-accountservice.jar'

ENTRYPOINT ["java","-jar","/test-springboot-accountservice/test-springboot-accountservice/target/test-springboot-accountservice.jar"]




