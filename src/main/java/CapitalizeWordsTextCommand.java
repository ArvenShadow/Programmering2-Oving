public class CapitalizeWordsTextCommand extends CapitalizeTextCommand {

  @Override
  public String execute(String text) {

    if (text == null || text.isEmpty()) {
      return text;
    }


    String[] words = text.split("\\s+");


    StringBuilder capitalizedText = new StringBuilder();

    for (String word : words) {
      if (!word.isEmpty()) {

        capitalizedText.append(word.substring(0, 1).toUpperCase())
            .append(word.substring(1))
            .append(" ");
      }
    }


    return capitalizedText.toString().trim();
  }
}