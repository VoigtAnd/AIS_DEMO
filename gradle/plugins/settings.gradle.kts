dependencyResolutionManagement {
/*    versionCatalogs {
        create("libs") {
            from(files("../libs.versions.toml"))
        }
    }*/

    repositories.mavenCentral()
}

pluginManagement {
    repositories.gradlePluginPortal()
}

include("ais-modules")