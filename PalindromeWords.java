import java.util.Scanner;

public class PalindromeWords {
    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println("Bu kelime palindrom değildir.");
                return false;
            }
            i++;
            j--;
        }
        System.out.println("Bu kelime palindromdur.");
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Palindrom olup olmadığını öğrenmek için bir kelime girin: ");
        String kelime = input.nextLine();
        System.out.println(isPalindrome(kelime));
    }
}
//Başka bir yöntem ise kelimeyi sondan okuyup yeni bir stringe atamak ve ilk stringle karşılaştırmak
/*
static boolean isPalindrome2(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        if (str.equals(reverse))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));
    }
}
 */