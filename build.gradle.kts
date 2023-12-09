plugins {
    kotlin("jvm") version "1.9.21"
    java
    application
}

subprojects {
    repositories {
        mavenCentral()
    }

    apply(plugin = "kotlin")

    dependencies {
        implementation("org.slf4j:slf4j-api:2.0.9")
        implementation("ch.qos.logback:logback-classic:1.4.14")
        implementation("ch.qos.logback:logback-core:1.4.14")
        implementation("org.jetbrains.kotlin:kotlin-reflect:1.9.21")
    }
}

group = "ru.kvs"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}