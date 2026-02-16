// This is a Gradle build configuration file using Kotlin DSL
// It is intended for use within a Java project structure

// Note: The following blocks are standard Gradle configuration
// for a Java application.

plugins {
    // Apply the java plugin to add support for Java
    id("java")
    // Apply the application plugin to make it easy to run the code
    id("application")
}

repositories {
    // Use Maven Central for resolving dependencies
    mavenCentral()
}

dependencies {
    // Standard testing library configuration
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
}

// Configuration for Java toolchain
java {
    toolchain {
        // Matches the JDK 25 version found in your environment
        languageVersion.set(JavaLanguageVersion.of(25))
    }
}

// Application entry point configuration
application {
    // The main class of your DSA project
    mainClass.set("Main")
}

tasks.withType<Test> {
    useJUnitPlatform()
}