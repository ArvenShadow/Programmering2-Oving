public class WrapSelectionTextCommand extends WrapTextCommand{
  protected String selection;

  public WrapSelectionTextCommand(String opening, String end, String selection) {
    super(opening, end);
    this.selection = selection;
  }

  @Override
  public String execute(String text) {
    int selectionStart = text.indexOf(selection);
    if (selectionStart == -1) {
      return super.execute(text);
    }
    int selectionEnd = selectionStart + selection.length();

    String before = text.substring(0, selectionStart);
    String after = text.substring(selectionEnd);

    String wrappedSelection = opening + selection + end;

    return before + wrappedSelection + after;
  }
}
