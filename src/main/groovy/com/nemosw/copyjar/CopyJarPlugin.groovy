package com.nemosw.copyjar

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task

class CopyJarPlugin implements Plugin<Project> {
    @Override
    void apply(Project target) {

        CopyJarExtension ext = target.extensions.create('copyJar', CopyJarExtension)

        target.pluginManager.withPlugin('java') {
            Task copyJar = target.task('copyJar').doLast {

                def filesToCopy = target.copySpec {
                    from target.jar.archivePath
                }

                ext.destinations.each { destination ->
                    target.copy {
                        with filesToCopy
                        into destination instanceof Closure ? destination.call() : destination
                    }
                }
            }

            target.tasks.build.finalizedBy copyJar
        }
    }
}
