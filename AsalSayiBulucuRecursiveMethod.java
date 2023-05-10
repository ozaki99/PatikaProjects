import java.util.Scanner;


//   https://github.com/BBilgeKaplan/PatikaDev/blob/main/Java/PrimeNumRecursive.java
//   Kod sahibi


public class AsalSayiBulucuRecursiveMethod {

    static boolean isPrime(int n, int i){
        // 0 and 1 are not prime numbers.
        if(n==0 || n==1){
            return false;
        }
        // 2 is prime number.
        if(n==2){
            return true;
        }
        else{
            // If the number has a divisor, it must be equal to 1 and itself. Otherwise the number is not prime.
            if(n%i==0){
                if(i==1){
                    return isPrime(n,i+1);
                }else if(n==i){
                    return true;
                }else{
                    return false;
                }
            } else{
                return isPrime(n,i+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        System.out.print("Enter number : ");
        n=inp.nextInt();
        if(isPrime(n,1)){
            System.out.println(n + " is prime number.");
        }else {
            System.out.println(n + " is not prime number.");
        }
    }
}

















//ASKIDA







/*
public class AsalSayiBulucuRecursiveMethod {
    static boolean asal(int a) {
        for (int i = 2; i <= a; i++) {
            int n = 0;
            for (int j = 2; j <= a; j++) {
                if (i % j == 0) {
                    n++;
                }
            }
            if (n < 2) {
                System.out.print(i + " ");
                return true;
            }
        }

            return false;
        }
        public static void main (String[]args){

            Scanner input = new Scanner(System.in);
            System.out.print("Lütfen bir sayı girin: ");
            asal(input.nextInt());
        }
    }

 */