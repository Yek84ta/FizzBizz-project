import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rules rules = new Rules();

        System.out.println("Hi!");
        System.out.println("In order to start the game give me some information. Let's go.");
        System.out.println("Give me the count of numbers.");

        int count = scanner.nextInt();

        System.out.println("Please enter number with its word.");

        for (int i = 0; i < count; i++) {
            int number = scanner.nextInt();
            String word = scanner.next();
            rules.setStruct(number, word);
        }

        System.out.println("Tell me a range of numbers you want to run the game for.");
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        rules.FinalResult(start, end);
    }
}