 
# Base Image ubuntu
FROM ubuntu:18.04

# Installing dependencies
RUN apt-get update
RUN apt-get install -y openjdk-8-jdk maven 

# coping the required application files
COPY . /spring_boot_clientTwo
WORKDIR /spring_boot_clientTwo/clientTwo

# building the spring boot app
RUN mvn clean install

WORKDIR /spring_boot_clientTwo/clientTwo/target

# running the spring boot app
CMD ["java", "-jar", "clientTwo-0.0.1-SNAPSHOT.jar"]
