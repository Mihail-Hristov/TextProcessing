import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] gameParameters = scanner.nextLine().split("\\s+");

        double totalSum = 0.0;

        for (String item : gameParameters) {
            double currentSum = 0.0;
            char leftLetter = item.charAt(0);
            char rightLetter = item.charAt(item.length() - 1);
            int number = Integer.parseInt(item.substring(1, item.length() - 1));

            if (Character.isUpperCase(leftLetter)){
                int numberForDivide = leftLetter - 64;
                currentSum += (0.0 + number) / numberForDivide;
            }else if (Character.isLowerCase(leftLetter)){
                int numberForMultiply = leftLetter - 96;
                currentSum += (0.0 + number) * numberForMultiply;
            }
            if (Character.isUpperCase(rightLetter)){
                int numberForSubtract = rightLetter - 64;
                currentSum -= numberForSubtract;
            }else if (Character.isLowerCase(rightLetter)){
                int numberForAdding = rightLetter - 96;
                currentSum += numberForAdding;
            }

            totalSum += currentSum;
        }

        System.out.println(String.format("%.2f",totalSum));
    }
}
