import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)){
                String substringForRemoving = input.charAt(i) + String.valueOf(input.charAt(i + 1));
                input = input.replaceFirst(substringForRemoving, String.valueOf(input.charAt(i)));
                i --;
            }
        }

        System.out.println(input);
    }
}
