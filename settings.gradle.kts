/*
 * This file was generated by the Gradle 'init' task.
 *
 * The settings file is used to specify which projects to include in your build.
 *
 * Detailed information about configuring a multi-project build in Gradle can be found
 * in the user manual at https://docs.gradle.org/5.6.1/userguide/multi_project_builds.html
 */
rootProject.name = "PermissionsEx"

include("api")
include("core")

listOf("sponge", "sponge7", "bukkit", "fabric", "bungee", "velocity").forEach {
    include(":platform:$it")
}

listOf("proxy-common", "hikari-config", "minecraft", "glob").forEach {
    include("impl-blocks:$it")
}

listOf("file", "sql", "conversion").forEach {
    include(":datastore:$it")
}
