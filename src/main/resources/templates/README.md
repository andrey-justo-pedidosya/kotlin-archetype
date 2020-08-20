<<<<<<< HEAD
<h1 align="center">
  <a href="https://github.com/pedidosya">
  	<img src="https://www.pedidosya.com/careers/images/pedidosya-logo.svg" alt="Markdownify" width="200">
  </a>
  <br>
  <br>
  @projectName@
  <br>
</h1>
<h4 align="center"></h4>
<p align="center">
  <a href="#key-features">Key Features</a> •
  <a href="#dependencies">Dependencies</a> •
  <a href="#how-to-use">How To Use</a> •
  <a href="#documentation">Documentation</a> •
  <a href="#faq">FAQ</a>
</p>
=======
# Kotlin + Spring Archetype
>>>>>>> a6b39e3... simple config

## Key Features

* Features for our service

## Prerequisites

- Java 1.11+ (use OpenJDK)
  * Running on linux you may encounter ssl cert problems, consider doing something like [this](https://github.com/travis-ci/travis-ci/issues/9368#issuecomment-395354755)
  * For Mac users use:
    - `brew tap AdoptOpenJDK/openjdk`
    - `brew cask install adoptopenjdk`
- Gradle 5.+
- Docker (only to run integration tests)

### Running the project

In order to run the project you need to execute the following command:

```
./gradlew bootRun
```

### Running the tests

In order to run the project tests you need to execute the following command:

```
gradle test
```

### Build Project

```
./gradlew clean build
./docker build .
```

This will generate the artifact and create a docker for you to deploy your application

## Documentation


## FAQ

* If you want to add new features to this project please [see the contribution guide](CONTRIBUTING.md)
* Questions?
