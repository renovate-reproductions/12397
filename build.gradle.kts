import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    java

    id("org.springframework.boot") version PluginVersions.springBoot apply false
    id("io.spring.dependency-management") version "1.0.11.RELEASE" apply false
    kotlin("jvm") version PluginVersions.kotlin apply false
    kotlin("plugin.spring") version PluginVersions.kotlin apply false
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
        implementation(Dependencies.kotlinStdlibJdk8Extension)
        implementation(Dependencies.kotlinReflection)
    }
}
