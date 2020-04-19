# Server Side Load Balancing using Zuul and Eureka Spring boot application 

Dockerized Spring Boot application for Server side load balancing using Zuul and Eureka.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development purposes. See running for notes on how to run the project on a system.

### Prerequisites

1. Clone the project to your local environment:
    ```
    git clone https://github.com/ankitrajput0096/Server_Side_LoadBalancing_Using_Zuul_and_Eureka
    ```

2. You need Docker to be installed:

    #### Windows:
    https://download.docker.com/win/stable/Docker%20for%20Windows%20Installer.exe
    
    #### Mac:
    https://download.docker.com/mac/stable/Docker.dmg
    
    #### Ubuntu:
    https://docs.docker.com/install/linux/docker-ce/ubuntu/

### Installing

Once you have docker installed on your environment, install the project dependencies via:

Build docker Image:

```
docker-compose build
```

## Running

Start docker:

```
docker-compose up
```
Or


Start docker with scaled up services:

```
docker-compose up --scale clientone=3 --scale clienttwo=3

```
### NOTE:
Can scale up clientone and clienttwo services to max instances of 5.
If you want to scale even higher, then increase the port range in `docker-compose` file.

Your Zuul proxy server should be now running on http://localhost:8000, ClientOne server should be now running on http://localhost:8080-8085 and ClientTwo server should be now running on http://localhost:8086-90 and Eureka server should be now running on http://localhost:8761

## Get an access to all exposed API's with Postman

1. Install Postman (https://www.getpostman.com)
2. Import Postman collection from the `Zuul_Eureka_SpringBoot.postman_collection.json` file
3. Enjoy !!

## NOTE : To see server side load balancing observe terminal logs of `docker-compose`. When trying to hit same endpoint multiple times parallely. 

## Built With

* [Spring Boot](https://spring.io/projects/spring-boot) - Spring Boot 2
* [Maven](https://maven.apache.org/) - Dependency Management
* [Docker](https://www.docker.com/) - For containerization of application
* [Zuul](https://spring.io/guides/gs/routing-and-filtering/) - For Routing and Filtering using Zuul
* [Eureka](https://spring.io/guides/gs/service-registration-and-discovery/) - For Eureka admin and client

## Contributing

If you have any improvement suggestions please create a pull request and I'll review it.


## Authors

* **Ankit Rajput** - *Initial work* - [Github](https://github.com/ankitrajput0096)

## License

This project is licensed under the MIT License

## Acknowledgments

* Big thanks to Pivotal for Spring Boot framework, love it!


