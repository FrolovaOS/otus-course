
rootProject.name = "otus-course"

pluginManagement {
    plugins {
        val kotlinVersion: String by settings

        kotlin("jvm") version kotlinVersion apply false

    }
}

include("m1l1-quickstart")