plugins {
    id("java")
    kotlin("jvm")
    id("me.champeau.jmh") version "0.7.2"
}

group = "uk.co.flaminscotsman.kolmafia"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation(kotlin("stdlib-jdk8"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(17)
}

jmh {
    fork = 2
    iterations = 3
    timeOnIteration = "5s"
    threads = 4
    warmup = "3s"
    warmupIterations = 1
}