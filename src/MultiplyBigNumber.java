import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bigNumber = scanner.nextLine();
        int smallNumber = Integer.parseInt(scanner.nextLine());
        if (smallNumber == 0){
            System.out.println("0");
            return;
        }

        while (bigNumber.charAt(0) == '0'){
            bigNumber = bigNumber.substring(1);
        }

        StringBuilder result = new StringBuilder();
        int digitForNext = 0;

        for (int i = bigNumber.length() - 1; i >= 0 ; i--) {
            int currentNumber = Integer.parseInt(String.valueOf(bigNumber.charAt(i)));
            int multiplyNumber = (currentNumber * smallNumber) + digitForNext;
            String stringForAdding = String.valueOf(multiplyNumber);
            result.insert(0, stringForAdding.charAt(stringForAdding.length() - 1));
            if (multiplyNumber > 9){
                digitForNext = Integer.parseInt(String.valueOf(stringForAdding.charAt(0)));
            }else {
                digitForNext = 0;
            }
            if (i == 0 && digitForNext > 0){
                result.insert(0, digitForNext);
            }
        }

        System.out.println(result);
    }
}
