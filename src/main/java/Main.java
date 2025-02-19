import java.util.List;

public class Main {
  public static void main(String[] args) {

    CapitalizeTextCommand command1 = new CapitalizeTextCommand();
    CapitalizeSelectionTextCommand command2 = new CapitalizeSelectionTextCommand("selection");
    WrapTextCommand command3 = new WrapTextCommand("<p>", "</p>");
    ReplaceTextCommand command4 = new ReplaceTextCommand(" is "," isn't ");


    Script script = new Script(List.of(command1, command2, command3, command4));


    String result = script.execute("this is a test with a selection inside it");
    System.out.println(result);
  }
}