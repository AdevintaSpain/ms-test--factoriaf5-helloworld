# ms-test--factoriaf5-helloworld

HelloWorld for Factoria F5

Sample used in Adevinta Spain's [Factoria F5](https://factoriaf5.org/) masterclasses

## Develop

1. Clone/fork this repo or create your own using [spring initializr](https://start.spring.io/#!type=gradle-project&language=kotlin&platformVersion=2.6.3&packaging=jar&jvmVersion=11&groupId=com.adevinta.factoriaf5&artifactId=HelloWorld&name=HelloWorld&description=Demo%20project%20for%20Spring%20Boot&packageName=com.adevinta.factoriaf5.HelloWorld)


## Run

```
docker-compose up -d
./gradlew bootRun
```

## Test

```
./gradlew test
```

## Integration Test

```
./gradlew integrationTest
```

## Tools

* [Docker desktop](https://www.docker.com/products/docker-desktop)
* [IntelliJ Idea](https://www.jetbrains.com/idea/) or any other IDE you like
* Any [OpenJDK Java 11](https://en.wikipedia.org/wiki/OpenJDK) like [Adoptium](https://adoptium.net/)
