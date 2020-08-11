import java.util.*;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, StringBuilder> characterBook = new TreeMap<>();


        for (int i = 0; i < input.length(); i++) {
            Character temp = input.charAt(i);
            if (Character.isDigit(temp)){
                characterBook.putIfAbsent("1digit", new StringBuilder());
                StringBuilder curr = characterBook.get("1digit").append(temp);
                characterBook.put("1digit", curr);
            }else if (Character.isAlphabetic(temp)){
                characterBook.putIfAbsent("2char", new StringBuilder());
                StringBuilder curr = characterBook.get("2char").append(temp);
                characterBook.put("2char", curr);
            }else{
                characterBook.putIfAbsent("3other", new StringBuilder());
                StringBuilder curr = characterBook.get("3other").append(temp);
                characterBook.put("3other", curr);
            }
        }

        characterBook
                .entrySet()
                .stream()
                .forEach(c -> System.out.println(String.format("%s",c.getValue())));

    }
}
