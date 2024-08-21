# blogging-platform-api

cc: [source-challenge](https://roadmap.sh/projects/blogging-platform-api)
## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)
- [Docker](https://docs.docker.com/engine/installation/)
- [Docker-compose](https://docs.docker.com/compose/install/)

## Running the application locally

First run the docker container

```
docker compose up -d
```

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `BloggingPlatformApiApplication` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```



## API Description
### Swagger UI - [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

### API Documentation - [http://localhost:8080/api-docs](http://localhost:8080/api-docs)


![img_4.png](images/img_4.png)
### GET /posts/{id} - returns a single post by id
![img.png](images/img.png)

### GET /posts - returns a list of posts
![img_1.png](images/img_1.png)


### POST /posts - creates a new post
![img_3.png](images/img_3.png)

### PUT /posts/{id} - updates a post
![img_2.png](images/img_2.png)

### DELETE /posts/{id} - deletes a post
![img_5.png](images/img_5.png)


## Copyright

Released under the Apache License 2.0. See the [LICENSE](https://github.com/codecentric/springboot-sample-app/blob/master/LICENSE) file.
