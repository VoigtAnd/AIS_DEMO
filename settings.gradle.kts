
rootProject.name = "AIS_DEMO"


pluginManagement {
    repositories.gradlePluginPortal()
    includeBuild("gradle/plugins")

    dependencyResolutionManagement {
        repositories.mavenCentral()
    }
}


include(":platform_module")
include(":tenant")
include(":backoffice")

val aisModules = file("ais_modules").listFiles()
for(m in aisModules) {
    include(":ais_modules:${m.name}:common")
    include(":ais_modules:${m.name}:domain")
    include(":ais_modules:${m.name}:infrastructure")
    include(":ais_modules:${m.name}:application")
}
