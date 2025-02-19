import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WrapTextCommandTest {
  @Test
  void testWrapTextCommand() {
    WrapTextCommand command = new WrapTextCommand("<p>", "<p>");
    String result = command.execute("text to be wrapped");
    assertEquals("<p>text to be wrapped<p>", result);
  }
}
