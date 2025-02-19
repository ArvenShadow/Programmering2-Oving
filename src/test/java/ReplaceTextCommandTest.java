import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ReplaceTextCommandTest {
  @Test
  void testReplaceTextCommand() {
    ReplaceTextCommand command = new ReplaceTextCommand("target", "replacement");
    String result = command.execute("text with target and target");
    assertEquals("text with replacement and replacement", result);
  }
}
