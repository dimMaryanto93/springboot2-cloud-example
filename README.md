# Spring Cloud Example

Belajar spring-cloud for microservice architecture.

## Architecture `spring-cloud`

![arch spring-cloud](imgs/spring-cloud-arch.jpg)

**Configuring runtime**

|   application name    | the ports binding                                         |
| :--------             | :-------                                                  |
| config-server         | [localhost:8888](http://localhost:8888)                   |
| sample-service        | [localhost:8080](http://localhost:8080)                   |
| wilayah-service       | [localhost:7000,7001...](http://localhost:6000)           |
| nasabah-service       | [localhost:6000,6001,6002...](http://localhost:6000)      |