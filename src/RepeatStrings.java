import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        StringBuilder newWord = new StringBuilder();

        for (String item : input) {
            for (int i = 0; i < item.length(); i++) {
                newWord.append(item);
            }
        }

        //String result = newWord.toString();

        System.out.println(newWord);
    }
}
