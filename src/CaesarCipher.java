import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder encryptedText = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentCharacter = (char) (input.charAt(i) + 3);
            encryptedText.append(currentCharacter);
        }

        System.out.println(encryptedText);
    }
}
