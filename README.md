# springboot2-async-controllers

This project is a quite simple example to show the asynchronous capabilities of Spring 5 and Spring Boot 2 release versions.

There are two different classes showing different ways of building Async Controllers:

* `rekkeb.controller.HelloController`: Shows how to build an asynchronous controller using annotations
* `rekkeb.functional.Router`: Shows how to build an asynchronous controller using WebFlux Reactive Programming model

## Getting Started

Just clone the repository and run: ``mvn clean compile``

### Prerequisites

This project has been built using **Java Version**: 1.8.0_162

And **Maven Version**: 3.5.0


## Running the tests

Just run: ``mvn clean compile test``

Tests show how to use [WebClient](https://docs.spring.io/spring/docs/current/spring-framework-reference/web-reactive.html#webflux-client) to test asynchronous controllers


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## References

* [Web On Reactive Stack](https://docs.spring.io/spring/docs/current/spring-framework-reference/web-reactive.html#spring-webflux) - Spring 5

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

