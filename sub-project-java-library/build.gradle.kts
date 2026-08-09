plugins {
    id("java-library")
}

dependencies {
    api("commons-httpclient:commons-httpclient:3.1")
    implementation("org.apache.commons:commons-lang3:3.5")
}

repositories {
    mavenCentral()
}