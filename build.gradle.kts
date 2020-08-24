import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    java
    kotlin("jvm") version "1.4.0"
    id("com.github.johnrengelman.shadow") version "6.0.0"
}

group = "org.clocknot"
version = "1.0-SNAPSHOT"

tasks {
    named<ShadowJar>("shadowJar") {
        destinationDir = file("C:\\Users\\david\\DreamBot\\Scripts")
        exclude("**\\module-info.class")
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    compileOnly(files("./libs/dreambot-api.jar"))
    implementation("org.jgrapht:jgrapht-core:1.4.0")
    implementation("org.jgrapht:jgrapht-ext:1.4.0")
    implementation("com.github.vlsi.mxgraph:jgraphx:4.1.0")
}