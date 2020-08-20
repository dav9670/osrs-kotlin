import org.dreambot.api.methods.MethodProvider

class LoggerTest(private val message: String = "loggertest") {
    init {
        MethodProvider.log(message)
    }

    fun printMessage() {
        MethodProvider.log("printMessage : $message")
    }
}