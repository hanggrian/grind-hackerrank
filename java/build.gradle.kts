plugins {
    java
    checkstyle
    jacoco
}

dependencies {
    checkstyle(libs.rulebook.checkstyle)

    implementation(libs.gson)

    testImplementation(libs.truth)
}
