import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    java
    kotlin("jvm") version "1.3.72"
    id("com.spinclass.gradle.dreambot") version "1.1"
    id("com.github.johnrengelman.shadow") version "6.0.0"
}

group = "org.clocknot"
version = "1.0-SNAPSHOT"

tasks {
    named<ShadowJar>("shadowJar") {
        destinationDir = file("C:\\Users\\david\\DreamBot\\Scripts")
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    compileOnly(files("./libs/dreambot-api.jar"))
}