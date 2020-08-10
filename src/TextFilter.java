import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedWords = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < bannedWords.length; i++) {
            String wordForReplacement  = bannedWords[i];
            String replaceWith = wordToAsterisks(wordForReplacement);

            text = text.replace(wordForReplacement, replaceWith);
        }

        System.out.println(text);

    }

    public static String wordToAsterisks(String oldWord){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < oldWord.length(); i++) {
            result.append("*");
        }
        return result.toString();
    }
}
