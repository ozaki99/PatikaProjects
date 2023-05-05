import java.util.Scanner;

public class MorseCode {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String a1  = "*- ";
        String b  = "-*** ";
        System.out.print("Type to convert:");
        b = input.nextLine();

        System.out.println(b);
    }
}
