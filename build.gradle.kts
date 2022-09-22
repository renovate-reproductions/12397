import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java

    alias(libs.plugins.spring.boot)
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.spring)
    alias(libs.plugins.spring.dependency.management)
}

allprojects {
    group = "com.huisam.renovate"

    repositories {
        mavenCentral()
    }
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")

    java.sourceCompatibility = JavaVersion.VERSION_11
    java.targetCompatibility = JavaVersion.VERSION_11

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "11"
        }
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }

    dependencies {
        implementation(rootProject.libs.kotlin.reflect)
    }
}
