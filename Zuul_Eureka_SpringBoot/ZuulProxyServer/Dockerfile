 
# Base Image ubuntu
FROM ubuntu:18.04

# Installing dependencies
RUN apt-get update
RUN apt-get install -y openjdk-8-jdk maven 

# coping the required application files
COPY . /spring_boot_zuul_proxy_server
WORKDIR /spring_boot_zuul_proxy_server/mainserver

# building the spring boot app
RUN mvn clean install

WORKDIR /spring_boot_zuul_proxy_server/mainserver/target

# running the spring boot app
CMD ["java", "-jar", "mainserver-0.0.1-SNAPSHOT.jar"]
