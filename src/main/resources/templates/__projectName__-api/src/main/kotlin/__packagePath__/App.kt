package templates.__projectName__ - api.src.main.kotlin.__packagePath__

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
class App

fun main(args: Array<String>) {
    runApplication<App>(*args)
}

