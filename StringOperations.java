import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // 1. Reverse the string
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        System.out.println("Reversed string: " + reversed);

        // 2. Count vowels
        int vowelCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = Character.toLowerCase(input.charAt(i));
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);

        // 3. Check for palindrome
        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }

        scanner.close();
    }
}
