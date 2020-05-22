clone the project

Create the bootJar for all the submodules using gradle

$docker-compose up


This command should be run from the root folder of project
This project is sprint boot eureka example with gradle. There are 3 submodules.

Eureka Server
Rest Service as Eureka Client (Producer)
Rest Service as Eureka Client (Consumer)
Eureka server is used for service discovery concept in micro services. When the eureka sever goes up, it can verified using
Eureka Server : http://localhost:8761/
Producer rest service : http://localhost:8080/greet/Stephen
Consumer rest service : http://localhost:8082/greet/Stephen

The prodcuer rest services uses eureka client discovery to communicate with consumer rest service.
