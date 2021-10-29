dependencies {
    implementation(Dependencies.springBootWeb)
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation(Dependencies.mockk)
}
