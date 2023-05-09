public class PalindromSayilar {

    // sayı / 10 = son basamağı silme
    // sayı % 10 = son basamağı alma
    /*
    Palindrom Sayı Nedir ?
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
     */

    static boolean isPalindrom(int number) {
        int temp = number, lastNumber, reverseNumber = 0;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (reverseNumber == number) {
            System.out.println(number + " Sayısı palindrom bir sayıdır.");
            return true;
        } else {
            System.out.println(number + " Sayısı palindrom bir sayı değildir.");
            return false;
        }


    }

    public static void main(String[] args) {

        isPalindrom(299920);
    }
}
