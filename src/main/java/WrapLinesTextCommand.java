import java.util.Arrays;
import java.util.stream.Collectors;

public class WrapLinesTextCommand extends WrapTextCommand{

  public WrapLinesTextCommand(String opening, String end) {
    super(opening, end);
  }

  @Override
  public String execute(String text) {
    return Arrays.stream(text.split(
      "\n"))
      .map(line -> opening + line + end)
      .collect(Collectors.joining("\n"));
  }
}
