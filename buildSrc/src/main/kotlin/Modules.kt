import org.gradle.api.artifacts.Dependency
import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.project

data class Module(
    val path: String,
    val name: String
)

object Modules : Iterable<Module> {
    private val modules = mutableListOf<Module>()

    val api = module(path = "renovate-api")

    private fun module(path: String, name: String = ":$path"): Module =
        Module(path, name).also { modules.add(it) }

    override fun iterator(): Iterator<Module> =
        modules.iterator()
}

fun DependencyHandler.api(module: Module): Dependency? =
    add("api", this.project(module.name))

fun DependencyHandler.implementation(module: Module): Dependency? =
    add("implementation", this.project(module.name))

fun DependencyHandler.compileOnly(module: Module): Dependency? =
    add("compileOnly", this.project(module.name))

fun DependencyHandler.testImplementation(module: Module): Dependency? =
    add("testImplementation", this.project(module.name))

