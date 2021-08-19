import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.5.3"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    kotlin("jvm") version "1.5.30-RC"
    kotlin("plugin.spring") version "1.5.21"
}

group = "com.sherry"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencyManagement{
    imports {
        mavenBom("io.camunda:zeebe-bom:1.2.0-alpha1")
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation("io.camunda:zeebe-client-java:1.2.0-alpha1")
    //implementation ("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.5.30-RC")
    //implementation ("org.jetbrains.kotlin:kotlin-reflect:1.5.30-RC")
    implementation ("org.apache.logging.log4j:log4j-core:2.14.1")
    implementation ("org.apache.logging.log4j:log4j-slf4j-impl:2.14.1")
    implementation("org.camunda.community:eze:0.1.0")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.7.1")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.7.1")
    testImplementation ("io.camunda:zeebe-test:1.2.0-alpha1")
    testImplementation ("org.camunda.community:eze-junit-extension:0.1.0")
    testImplementation ("io.zeebe:zeebe-test-container:3.0.0")
    testImplementation ("org.testcontainers:junit-jupiter:1.15.3")
    testImplementation ("org.assertj:assertj-core:3.19.0")
    testImplementation ("org.junit.jupiter:junit-jupiter-api:5.7.1")
    testImplementation ("org.jetbrains.kotlin:kotlin-test:1.5.30-RC")
    testImplementation ("org.awaitility:awaitility-kotlin:4.0.3")
    testImplementation ("io.zeebe.hazelcast:zeebe-hazelcast-exporter:1.0.1")
    testImplementation ("io.zeebe.hazelcast:zeebe-hazelcast-connector:1.0.1")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
