FROM brijeshw/ubuntu1404oraclejdk8

MAINTAINER Brijesh Walia "https://hub.docker.com/r/brijeshw"

WORKDIR ./microservice

RUN git clone -b docker https://github.com/brijeshw/test-springboot-accountservice.git ./servicesource

RUN cd ./servicesource/test-springboot-accountservice

RUN mvn package 

ADD  ./target/test-springboot-accountservice.jar ./service/

EXPOSE 8080

CMD java -jar ./service/test-springboot-accountservice.jar


