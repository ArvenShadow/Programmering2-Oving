import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WrapLinesTextCommandTest {
  @Test
  void testWrapLinesTextCommand() {
    WrapTextCommand command = new WrapLinesTextCommand("<p>", "<p>");
    String result = command.execute("first line\nsecond line");
    assertEquals("<p>first line<p>\n<p>second line<p>", result);
  }
}
