import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    idea
    java
    kotlin("jvm") version "1.8.22"

/*
    id("org.springframework.boot") version "3.1.4"
    id("io.spring.dependency-management") version "1.1.0"
*/

    id("org.springframework.boot") version "3.1.4" apply false

    //kotlin("plugin.spring") version "1.8.22"

}

repositories {
    mavenCentral()
    maven { url = uri("https://repo.spring.io/milestone") }
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs += "-Xjsr305=strict"
        jvmTarget = "17"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}



subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "version-catalog")
/*
    apply(plugin = "org.jetbrains.kotlin.plugin.spring")
    apply(plugin = "org.springframework.boot")
*/
  //  apply(plugin = "io.spring.dependency-management")


/*    the<DependencyManagementExtension>().apply {
        imports {
            mavenBom(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES)
        }
    }*/

    dependencies {

        implementation(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES)
    }



    repositories {
        mavenCentral()
        //maven { url = uri("https://repo.spring.io/milestone") }
    }

/*
    java.toolchain.languageVersion.set(JavaLanguageVersion.of(17))
*/
}

