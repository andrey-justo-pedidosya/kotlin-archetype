
# Kotlin + Spring Archetype

## Key Features

* This plugin will generate a new project into the folder `generated` for you to start your micro service

## Prerequisites

- Java 1.11+ (use OpenJDK)
  * Running on linux you may encounter ssl cert problems, consider doing something like [this](https://github.com/travis-ci/travis-ci/issues/9368#issuecomment-395354755)
  * For Mac users use:
    - `brew tap AdoptOpenJDK/openjdk`
    - `brew cask install adoptopenjdk`
- Gradle 5.+
- Docker (only to run integration tests)

### How to use it

- Clone the project
- Run:
```
./gradlew cleanArch generate -i -Dgroup=com.justo -Dname=example -Dversion=1.0-SNAPSHOT
```

This will generate the project that you need to start your micro service.


## Documentation


## FAQ

* Questions?
