import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!"end".equals(input)){

            StringBuilder newWord = new StringBuilder();

            for (int i = input.length() - 1; i >= 0 ; i--) {
                newWord.append(input.charAt(i));
            }

            System.out.println(String.format("%s = %s",input, newWord));

            input = scanner.nextLine();
        }

    }
}
