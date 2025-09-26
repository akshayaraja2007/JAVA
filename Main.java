public class Main {
    public static void main(String[] args) {
        int rows = 5; // You can change this value to print more or fewer rows

        for (int i = 1; i <= rows; i++) {
            // Print stars for each row
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}
