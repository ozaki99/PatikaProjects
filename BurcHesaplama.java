import java.util.Scanner;

public class BurcHesaplama {
    public static void main(String[] args) {

        /*
        Koç Burcu : 21 Mart - 20 Nisan

    Boğa Burcu : 21 Nisan - 21 Mayıs

    İkizler Burcu : 22 Mayıs - 22 Haziran

    Yengeç Burcu : 23 Haziran - 22 Temmuz

    Aslan Burcu : 23 Temmuz - 22 Ağustos

    Başak Burcu : 23 Ağustos - 22 Eylül

    Terazi Burcu : 23 Eylül - 22 Ekim

    Akrep Burcu : 23 Ekim - 21 Kasım

    Yay Burcu : 22 Kasım - 21 Aralık

    Oğlak Burcu : 22 Aralık - 21 Ocak

    Kova Burcu : 22 Ocak - 19 Şubat

    Balık Burcu : 20 Şubat - 20 Mart

        Ödev
    Aynı örneği switch-case kullanmadan yapınız.
        */

        /*
        int month, day;
        String burc = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ay: ");
        month = input.nextInt();

        System.out.print("Doğduğunuz gün: ");
        day = input.nextInt();

        switch (month) {
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        burc = "Oğlak";
                    } else {
                        burc = "Kova";
                    }
                } else {
                    System.out.println("Geçersiz bir gün girdiniz");
                    //yerine bunu kullanmalıyım
                            isError = true;
                }
                break;
            default:
                isError = true

                if (isError) {
                    System.out.println("Hatalı giriş yaptınız");
                } else {
                    System.out.println("Burcunuz :" + burc);
                }



                */

                int day;
                String month;

                Scanner input = new Scanner(System.in);
                System.out.print("Doğduğunuz ay: ");
                month = input.nextLine();

                System.out.print("Doğduğunuz gün: ");
                day = input.nextInt();

                if (month.equals("ocak") || month.equals("Ocak") || month.equals("OCAK") || month.equals("1")) {
                    if (day >= 1 && day <= 21) {
                        System.out.println("Oğlak Burcusunuz");
                    }
                    if (day >= 22 && day <= 31) {
                        System.out.println("Kova Burcusunuz");
                    }
                } else if (month.equals("şubat") || month.equals("Şubat") || month.equals("ŞUBAT") || month.equals("2")) {
                    if (day >= 1 && day <= 19) {
                        System.out.println("Kova Burcusunuz");
                    }
                    if (day >= 20 && day <= 28) {
                        System.out.println("Balık Burcusunuz");
                    }
                } else if (month.equals("mart") || month.equals("Mart") || month.equals("MART") || month.equals("3")) {
                    if (day >= 1 && day <= 20) {
                        System.out.println("Balık Burcusunuz");
                    }
                    if (day >= 21 && day <= 31) {
                        System.out.println("Koç Burcusunuz");
                    }
                } else if (month.equals("nisan") || month.equals("Nisan") || month.equals("NİSAN") || month.equals("4")) {
                    if (day >= 1 && day <= 20) {
                        System.out.println("Koç Burcusunuz");
                    }
                    if (day >= 21 && day <= 30) {
                        System.out.println("Boğa Burcusunuz");
                    }
                } else if (month.equals("mayıs") || month.equals("Mayıs") || month.equals("MAYIS") || month.equals("5")) {
                    if (day >= 1 && day <= 21) {
                        System.out.println("Boğa Burcusunuz");
                    }
                    if (day >= 22 && day <= 31) {
                        System.out.println("İkizler Burcusunuz");
                    }
                } else if (month.equals("haziran") || month.equals("Haziran") || month.equals("HAZİRAN") || month.equals("6")) {
                    if (day >= 1 && day <= 22) {
                        System.out.println("İkizler Burcusunuz");
                    }
                    if (day >= 23 && day <= 30) {
                        System.out.println("Yengeç Burcusunuz");
                    }
                } else if (month.equals("temmuz") || month.equals("Temmuz") || month.equals("TEMMUZ") || month.equals("7")) {
                    if (day >= 1 && day <= 22) {
                        System.out.println("Yengeç Burcusunuz");
                    }
                    if (day >= 23 && day <= 31) {
                        System.out.println("Aslan Burcusunuz");
                    }
                } else if (month.equals("ağustos") || month.equals("Ağustos") || month.equals("AĞUSTOS") || month.equals("8")) {
                    if (day >= 1 && day <= 22) {
                        System.out.println("Aslan Burcusunuz");
                    }
                    if (day >= 23 && day <= 31) {
                        System.out.println("Başak Burcusunuz");
                    }
                } else if (month.equals("eylül") || month.equals("Eylül") || month.equals("EYLÜL") || month.equals("9")) {
                    if (day >= 1 && day <= 22) {
                        System.out.println("Başak Burcusunuz");
                    }
                    if (day >= 23 && day <= 30) {
                        System.out.println("Terazi Burcusunuz");
                    }
                } else if (month.equals("ekim") || month.equals("Ekim") || month.equals("EKİM") || month.equals("10")) {
                    if (day >= 1 && day <= 22) {
                        System.out.println("Terazi Burcusunuz");
                    }
                    if (day >= 23 && day <= 31) {
                        System.out.println("Akrep Burcusunuz");
                    }
                } else if (month.equals("kasım") || month.equals("Kasım") || month.equals("KASIM") || month.equals("11")) {
                    if (day >= 1 && day <= 21) {
                        System.out.println("Akrep Burcusunuz");
                    }
                    if (day >= 22 && day <= 31) {
                        System.out.println("Yay Burcusunuz");
                    }
                } else if (month.equals("aralık") || month.equals("Aralık") || month.equals("ARALIK") || month.equals("12")) {
                    if (day >= 1 && day <= 21) {
                        System.out.println("Yay Burcusunuz");
                    }
                    if (day >= 22 && day <= 30) {
                        System.out.println("Oğlak Burcusunuz");
                    }
                } else {
                    System.out.println("HATA");
                }


                //Ctrl Alt Shift J select all same

        }
    }
