import java.util.Scanner;

public class HarmonikSeriler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N sayısını giriniz: ");
        int n = input.nextInt();
        double total = 0;
        double i = 1;
        while (i <= n){
            total += (1/i);
            i++;
        }
        System.out.println(total);
            //1. döngüde i = 1; total = 0 + (1/1) = 1;
            //2.döngüde i =2; total = 1 + (1/2) = 1.5;
    }
}
