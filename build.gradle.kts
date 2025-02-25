val jdkVersion = JavaLanguageVersion.of(libs.versions.jdk.get())
val jreVersion = JavaLanguageVersion.of(libs.versions.jre.get())

subprojects {
    plugins.withType<JavaLibraryPlugin>().configureEach {
        the<JavaPluginExtension>().toolchain.languageVersion.set(jdkVersion)
    }
    plugins.withType<CheckstylePlugin>().configureEach {
        the<CheckstyleExtension>().toolVersion = libs.versions.checkstyle.get()
    }

    tasks {
        withType<JavaCompile>().configureEach {
            options.release = jreVersion.asInt()
        }
        withType<JacocoReport>().configureEach {
            reports.xml.required = true
        }
    }
}

tasks.register(LifecycleBasePlugin.CLEAN_TASK_NAME) {
    delete(layout.buildDirectory)
}
