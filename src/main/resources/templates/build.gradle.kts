import io.spring.gradle.dependencymanagement.dsl.DependencyManagementExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.jetbrains.kotlin.jvm").version("1.3.41") apply true
    id("org.jetbrains.kotlin.plugin.spring").version("1.3.41")
    id("io.spring.dependency-management").version("1.0.8.RELEASE")
    id("org.springframework.boot") version "2.1.6.RELEASE" apply false
    maven
    jacoco
    idea
    java
}

val newRelicVersion = "5.2.0"
val newRelic by configurations.creating {
    extendsFrom(configurations["implementation"])
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "org.jetbrains.kotlin.plugin.spring")
    apply(plugin = "jacoco")
    apply(plugin = "io.spring.dependency-management")
    apply(plugin = "org.springframework.boot")

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "1.8"
        }
    }

    the<DependencyManagementExtension>().apply {
        imports {
            mavenBom(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES)
        }
    }



    dependencies {
        runtimeClasspath("com.newrelic.agent.java:newrelic-agent:$newRelicVersion")
    }
}

jacoco {
    toolVersion = "0.8.3"
}

allprojects {
<<<<<<< HEAD

=======
    apply(plugin = "idea")
    group = "com.justo"
    version = "1.0.0"
>>>>>>> a6b39e3... simple config
    repositories {
        jcenter()
    }
}

dependencies {
    newRelic("com.newrelic.agent.java:newrelic-agent:$newRelicVersion")
}

tasks.register<Copy>("copyNewRelic") {
    group = "build"
    description = "Add custom libraries to build our docker"

    from(configurations.get("newRelic").asPath)
    into("$buildDir/libs")
    rename { it.substring(0, it.indexOf("-")) + it.substring(it.lastIndexOf("."), it.length) }

    doLast {
        println("NewRelic copied!")
    }
}

tasks.getByName("assemble").dependsOn("copyNewRelic")