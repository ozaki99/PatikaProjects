import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç elemanlı Fibonacci serisi görmek istersiniz ? : ");

        int a = 0;
        int b = 1;
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            int c = (a + b);

            System.out.println(a + " + " + b + " = " + c);

            a = b;
            b = c;
        }
    }
}
