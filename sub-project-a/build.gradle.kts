plugins {
    application
}

dependencies {
    implementation(libs.guava)
}

repositories {
    mavenCentral()
}

application {
    mainClass = "org.example.App"
}