val developerId: String by project
val developerName: String by project
val developerUrl: String by project
val releaseArtifact: String by project
val releaseDescription: String by project
val releaseUrl: String by project

plugins {
    alias(libs.plugins.pages)
    alias(libs.plugins.git.publish)
}

pages {
    rootProject.layout.projectDirectory
        .dir("docs")
        .asFile
        .listFiles()
        ?.flatMap { it.listFiles()?.toList() ?: emptyList() }
        ?.forEach { content("${it.nameWithoutExtension}.html", it) }

    styles.add("https://cdnjs.cloudflare.com/ajax/libs/KaTeX/0.16.9/katex.min.css")
    scripts.addAll(
        "https://cdnjs.cloudflare.com/ajax/libs/KaTeX/0.16.9/katex.min.js",
        "https://cdnjs.cloudflare.com/ajax/libs/KaTeX/0.16.9/contrib/auto-render.min.js",
    )

    cayman {
        authorName = developerName
        authorUrl = developerUrl
        projectName = releaseArtifact
        projectDescription = releaseDescription
        projectUrl = releaseUrl

        darkMode = true
        colorPrimary = "#2ec866"
        colorSecondary = "#6687ff"
        colorSecondaryContainer = "#6687ff"
    }
}

gitPublish {
    repoUri.set("git@github.com:$developerId/$releaseArtifact.git")
    branch.set("gh-pages")
    contents.from(pages.outputDirectory)
}

tasks.register(LifecycleBasePlugin.CLEAN_TASK_NAME) {
    delete(layout.buildDirectory)
}
