plugins {
    id("java-library")
}

dependencies {
    api(platform(project(":sub-project-java-platform")))
    api("commons-httpclient:commons-httpclient")
    implementation("org.apache.commons:commons-lang3")
}

repositories {
    mavenCentral()
}