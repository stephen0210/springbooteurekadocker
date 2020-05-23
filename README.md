<b>System Requirements </b> <br>
Docker version 19.03.8, build afacb8b <br>
Java : 8 <br>

Steps to follow :
<ol>
<li>clone the project</li>
<li>Create the bootJar for all the submodules using gradle</li>
<li>$docker-compose up </li>
</ol>
Last command should be run from the root folder of project.<br><br>
The spring boot jars will be created as the part of the process, if you use this docker command <br>
$docker-compose  -f docker-compose-gradle-build.yml up<br>
Note : this will take time as the jars and pluggins are downloaded by the gradle at runtime<br>
<br><br>
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
