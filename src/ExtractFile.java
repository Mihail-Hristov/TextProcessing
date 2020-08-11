import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pathToTheFile = scanner.nextLine();

        int indexOfTheLastSlash = pathToTheFile.lastIndexOf("\\") +1;

        String[] tokens = pathToTheFile.substring(indexOfTheLastSlash).split("\\.");
        String fileName = tokens[0];
        String fileExtension = tokens[1];

        System.out.println(String.format("File name: %s",fileName));
        System.out.println(String.format("File extension: %s",fileExtension));

    }
}
