import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CapitalizeSelectionTextCommandTest {
  @Test
  void CapitalizeSelectionTextCommandTest() {
    CapitalizeSelectionTextCommand command = new CapitalizeSelectionTextCommand("selection");
    String result = command.execute("text with selection and selection");
    assertEquals("text with Selection and Selection", result);
  }
}
