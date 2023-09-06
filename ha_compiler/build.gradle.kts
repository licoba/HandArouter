plugins {
    id("kotlin-kapt")
    id("kotlin")
    id("java-library")

}

dependencies {
    implementation(project(":ha_annotation"))
    // 引入注解处理器  https://mvnrepository.com/artifact/com.google.auto.service/auto-service
    implementation("com.google.auto.service:auto-service:1.1.1")
}


java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}