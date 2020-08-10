import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(">");
        StringBuilder finalString = new StringBuilder();

        finalString.append(input[0]);
        finalString.append('>');
        int fromPreviousRemoving = 0;

        for (int i = 1; i < input.length; i++) {
            int charactersForRemoving = Integer.parseInt(String.valueOf(input[i].charAt(0))) + fromPreviousRemoving;
            if (charactersForRemoving > input[i].length()){
                charactersForRemoving -= charactersForRemoving - input[i].length();
                fromPreviousRemoving = (charactersForRemoving + 1) - input[i].length();
            }else {
                fromPreviousRemoving = 0;
            }
            int removeFromIndex = charactersForRemoving;
            String temp = input[i].substring(removeFromIndex);
            finalString.append(temp);
            if (i != input.length -1) {
                finalString.append('>');
            }
        }

        System.out.println(finalString);
    }
}
