# Micronaut vs Quarkus

This project is based on [Battle Of The Microservice Frameworks: Micronaut versus Quarkus edition! by Michel Schudel](https://www.youtube.com/watch?v=hnEXOqcNXPs) and it's [source codes](https://github.com/MichelSchudel/conference-service-micronaut). 

In original codes, I have to make some changes to make it work. 
in this repo, I merged two repos and create a branch for micronaut-data-jdbc, which should have much better performance then jpa. 
And it's true. 

both project will expose REST services that client can create and findAll. 

### Requirements

- a h2 db running in docker with default tcp port expose in host
- some steps are in src/main/docker/Dockerfile.* 
- at least a 12GB computer to build native image

### Artifacts

the master has following artifacts :
 - cons-mn-jpa-jar: Micronaut with JPA jar
 - cons-qk-jar: Quarkus with panache jar
 - cons-qk-native: Quarkus with panache jar

the branch micronaut-data-jdbc has following:
 - cons-mn-jdbc-jar: Micronaut with jdbc jar
 - cons-mn-jdbc-native: Micronaut with jdbc native
 
 ### Test results
 
 Here are some test results on my i7-3740QM 12GB KDE Neon linux
 
 (Load test using siege -c20 -t20, showing in last 3 cols)
 
artifact|size MB|docker image MB|startup time ms|trans rate /s|cpu|mem MB
--- | --- | ---| ---| ---| ---| ---
cons-mn-jdbc-jar    |16 |104    |2004|3380  |264%	|202
cons-qk-jar	        |40 |129    |2238|4071  |276%   |231
cons-mn-jpa-jar	    |42	|131    |3660|3838	|289%   |255
cons-mn-jdbc-native |68	|92	    |69  |2429	|320%	|283
cons-qk-native	    |67 |176    |78  |2948	|342%	|312

### Todos

- more quarkus improvements can be done. I'm a beginner. 
- micronaut jpa native image. I cannot make it work. 
- better base image for smaller image size. 
- maybe better test cases than seige

