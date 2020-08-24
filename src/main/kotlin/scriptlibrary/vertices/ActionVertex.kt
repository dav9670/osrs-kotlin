package scriptlibrary.vertices

abstract class ActionVertex {
    abstract val priority: Double

    open fun onStart() {}
    open fun onFinish() {}

    override fun toString(): String {
        return "class: ${this.javaClass.simpleName}, priority: $priority"
    }

    enum class Priority(val value: Double) {
        NONE(1.0),
        LOW(NONE.value * 0.8),
        MID(NONE.value * 0.5),
        HIGH(NONE.value * 0.2),
        CRITICAL(NONE.value * 0)
    }
}