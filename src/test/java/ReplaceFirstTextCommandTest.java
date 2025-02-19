import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ReplaceFirstTextCommandTest {
  @Test
  void testReplaceFirstTextCommand() {
    ReplaceFirstTextCommand command = new ReplaceFirstTextCommand("target", "replacement");
    String result = command.execute("text with target and target");
    assertEquals("text with replacement and target", result);
  }
}