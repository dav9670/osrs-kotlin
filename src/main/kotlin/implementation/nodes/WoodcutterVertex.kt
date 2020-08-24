package implementation.nodes

import scriptlibrary.vertices.ActionVertex

class WoodcutterVertex : ActionVertex() {
    override val priority: Double
        get() = Priority.MID.value
}