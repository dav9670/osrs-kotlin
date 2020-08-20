import org.dreambot.api.script.AbstractScript;
import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;

@ScriptManifest(author = "clocknot", category = Category.MISC, name = "Test mod with kotlin", version = 1.0)
public class Main extends AbstractScript {
    @Override
    public int onLoop() {
        LoggerTest loggerTest = new LoggerTest();
        loggerTest.printMessage();
        return 1000;
    }
}
