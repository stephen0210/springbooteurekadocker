<ol>
<li>clone the project</li>
<li>Create the bootJar for all the submodules using gradle</li>
<li>$docker-compose up </li>
</ol>
Last command should be run from the root folder of project

This project is spring boot rest eureka example with gradle.
There are 3 submodules. 
<ul>
<li>Eureka Server </li>
<li>Rest Service as Eureka Client (Producer) </li>
<li>Rest Service as Eureka Client (Consumer)</li>
</ul>

Eureka server is used for service discovery concept in micro services. 
When the eureka sever goes up, it can verified using  <br>
Eureka Server : http://localhost:8761/<br>
Producer rest service : http://localhost:8080/greet/Stephen <br>
Consumer rest service : http://localhost:8082/greet/Stephen <br>

The prodcuer rest services uses eureka client discovery to communicate with consumer rest service.
