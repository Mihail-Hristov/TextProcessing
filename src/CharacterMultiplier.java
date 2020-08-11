import java.util.Map;
import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        int sum = sumOfTheMultiplierCharacters(input);

        System.out.println(sum);

    }

    public static int sumOfTheMultiplierCharacters(String[] string){
        String firstString = string[0];
        String secondString = string[1];
        int sum = 0;

        int count = Math.min(firstString.length(), secondString.length());

        for (int i = 0; i < count; i++) {
            sum += firstString.charAt(i) * secondString.charAt(i);
        }

        if (firstString.length() > secondString.length()){
            for (int i = count; i < firstString.length(); i++) {
                sum += firstString.charAt(i);
            }
        }else {
            for (int i = count; i < secondString.length(); i++) {
                sum += secondString.charAt(i);
            }
        }

        return sum;
    }
}
