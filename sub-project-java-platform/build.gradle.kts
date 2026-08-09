plugins {
    id("java-platform")
}

dependencies {
    constraints {
        api("commons-httpclient:commons-httpclient:3.1")
        api("org.apache.commons:commons-lang3:3.8.1")
    }
}