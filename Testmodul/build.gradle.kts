plugins {
    id("application")
    id("ais-domain")
}

application {
    mainClass.set("MainHello")
}

dependencies {
    implementation(libs.commons.lang)

    //implementation(libs.spring.boot.starter.web)

//    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
//    implementation("org.jetbrains.kotlin:kotlin-reflect")
   // annotationProcessor("org.springframework.boot:spring-boot-configuration-processor")
//    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

