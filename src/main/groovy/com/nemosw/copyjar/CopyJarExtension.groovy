package com.nemosw.copyjar

class CopyJarExtension {
    private Object[] destinations = []

    void into(Object... destinationPaths) {
        this.destinations += destinationPaths
    }

    Object[] getDestinations() {
        return destinations
    }
}
