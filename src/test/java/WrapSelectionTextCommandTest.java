import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WrapSelectionTextCommandTest {
  @Test
  void testWrapSelectionTextCommand() {
    WrapTextCommand command = new WrapSelectionTextCommand("<p>", "<p>", "selection");
    String result = command.execute("text with selection");
    assertEquals("text with <p>selection<p>", result);
  }
}
