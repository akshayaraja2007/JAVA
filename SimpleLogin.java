import java.util.Scanner;

public class SimpleLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter User ID: ");
        String userId = scanner.nextLine();

        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        if (userId.equals("akshay") && password.equals("2007")) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed. Incorrect User ID or Password.");
        }

        scanner.close();
    }
}
