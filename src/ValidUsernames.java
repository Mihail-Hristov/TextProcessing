import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");

        for (String name : input) {
            if (isValid(name)){
                System.out.println(name);
            }
        }
    }

    public static boolean isValid(String name) {
        if (name.length() < 3 || name.length() > 16) {
            return false;
        }

        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetterOrDigit(name.charAt(i)) && name.charAt(i) != '-' && name.charAt(i) != '_') {
                return false;
            }
        }
        return true;
    }

}
