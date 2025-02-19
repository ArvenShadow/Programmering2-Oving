import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CapitalizeWordsTextCommandTest {
  @Test
  void CapitalizeWordsTextCommandTest() {
    CapitalizeWordsTextCommand command = new CapitalizeWordsTextCommand();
    String result = command.execute("text to be capitalized");
    assertEquals("Text To Be Capitalized", result);
  }
}
