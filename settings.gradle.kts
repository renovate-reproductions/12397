rootProject.name = "renovate"

rootDir
    .walk()
    .maxDepth(1)
    .filter {
        it.name != rootDir.name && it.name != "buildSrc" && it.isDirectory && file("${it.absolutePath}/build.gradle.kts").exists()
    }
    .forEach {
        include("${it.name}")
        project(":${it.name}").projectDir = file("$rootDir/${it.name}")
    }
