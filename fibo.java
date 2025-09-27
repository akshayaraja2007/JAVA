public class fibo{
    public static void main(String[] args) {
        int n = 10, a = 0, b = 1;
        int count = 0;

        while(count < n) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
            count++;
        }
    }
}
