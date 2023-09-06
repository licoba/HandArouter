pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "HandArouter"
include(":app")
include(":ha_annotation")
include(":ha_compiler")
include(":ha_core")
include(":base")
include(":module1")
include(":module2")
include(":ha_compiler")
