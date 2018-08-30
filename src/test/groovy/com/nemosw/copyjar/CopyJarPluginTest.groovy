package com.nemosw.copyjar

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Test

class CopyJarPluginTest{
    @Test
    void copyJarPluginTest() {
        Project project = ProjectBuilder.builder().build()
        project.pluginManager.apply('java')
        project.pluginManager.apply('com.nemosw.copy-jar')
    }
}
