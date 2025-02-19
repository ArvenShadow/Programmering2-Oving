import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CapitalizeTextCommandTest {
  @Test
  void CapitalizeTextCommandTest() {
    CapitalizeTextCommand command = new CapitalizeTextCommand();
    String result = command.execute("text to be capitalized");
    assertEquals("Text to be capitalized", result);
  }
}
