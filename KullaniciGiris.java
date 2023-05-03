import java.util.Scanner;

public class KullaniciGiris {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer, signUser, signPassword, loginUser, loginPassword;




        System.out.print("Kayıt Ekranına Hoşgeldiniz...\nLütfen yeni bir kullanıcı adı giriniz: ");
        signUser = input.nextLine();


        /*
        ! Başarısız

        if (signUser.equals("") && signUser.equals(" ")) {
            System.out.println("Bu kısım boş bırakılamaz");
            System.out.print("Lütfen yeni bir kullanıcı adı giriniz: ");
            signUser = input.nextLine();
        } else {

        }
        */

        System.out.print("Lütfen yeni bir şifre giriniz: ");
        signPassword = input.nextLine();


        /*
        ! Başarısız

        if (signPassword.equals("") && signPassword.equals(" ")) {
            System.out.println("Bu kısım boş bırakılamaz");
            System.out.print("Lütfen yeni bir parola giriniz: ");
            signPassword = input.nextLine();
        } else {
            System.out.println("Kayıt Başarılı");
        }
        */


        System.out.println("Giriş yapmak istiyor musunuz ? (evet/hayır):");
        answer = input.nextLine();


    if (answer.equals("evet")) {
        System.out.print("Kullanıcı adı: ");
        loginUser = input.nextLine();




        if (loginUser.equals(signUser)) {
            System.out.print("Parola: ");
            loginPassword = input.nextLine();




            if (loginPassword.equals(signPassword)) {
                System.out.println("Başarıyla giriş yapıldı! ");

                } else {
                    System.out.println("Parola yanlış\nProgram zaman aşımına uğradı\nLütfen programı yeniden çalıştırın");
                }



        } else {
            System.out.println("Kullanıcı adı yanlış\nProgram zaman aşımına uğradı\nLütfen programı yeniden çalıştırın");
        }

    } else if (answer.equals("hayır")) {
        System.out.println("Hoşçakalın...");

        }else{
                System.out.println("Hatalı bir giriş yaptınız lütfen programı yeniden başlatın");
        }
    }
}