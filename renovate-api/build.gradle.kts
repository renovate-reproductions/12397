plugins {
    id("org.springframework.boot")
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(libs.spring.boot.starter.web)
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    testImplementation(libs.spring.boot.test)
    testImplementation(libs.mockk)
}
