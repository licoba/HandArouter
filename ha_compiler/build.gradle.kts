plugins {
    id("kotlin-kapt")
    id("kotlin")
    id("java-library")

}

dependencies {
    // 引入注解接口接口
    implementation(project(":ha_annotation"))
    // 引入注解处理器  https://mvnrepository.com/artifact/com.google.auto.service/auto-service
    implementation("com.google.auto.service:auto-service:1.1.1")
    // 让注解处理器支持Kotlin
    kapt("com.google.auto.service:auto-service:1.1.1")
    implementation("com.squareup:kotlinpoet:1.10.2")

}


java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}