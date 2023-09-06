plugins {
    id("kotlin")
    id("java-library")
}


buildscript {
    repositories {
        mavenCentral()
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}