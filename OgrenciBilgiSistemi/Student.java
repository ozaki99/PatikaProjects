package OgrenciBilgiSistemi;

public class Student {
    Course ders1;
    Course ders2;
    Course ders3;
    Course ders4;
    String isim;
    String okulNo;
    String sinifi;
    double ortalama;
    boolean sinifiGecerMi;

    Student(String isim, String okulNo, String sinifi,
            Course ders1, Course ders2, Course ders3, Course ders4) {
//Ortalamayı almadık çünkü zaten alamayız notlarla hesaplamamız gerek.

        this.isim = isim;
        this.okulNo = okulNo;
        this.sinifi = sinifi;
        this.ders1 = ders1;
        this.ders2 = ders2;
        this.ders3 = ders3;
        this.ders4 = ders4;
        this.ortalama = 0.0;
        this.sinifiGecerMi = false;
    }

    void printOgrenciBilgileri(){
        System.out.println("======================================");
        System.out.println("Öğrenci Adı \t:" + this.isim);
        System.out.println("Öğrenci No \t\t:" + this.okulNo);
        System.out.println("Öğrenci Sınıf \t:" + this.sinifi);
    }
    void SinavNotlari(int not1, int not2, int not3, int not4){

        if(not1 >=0 && not1 <= 100){
            this.ders1.not = not1;
        }

        if(not2 >=0 && not2 <= 100){
            this.ders2.not= not2;
        }

        if(not3 >=0 && not3 <= 100){
            this.ders3.not = not3;
        }

        if(not4 >=0 && not4 <= 100){
            this.ders4.not = not4;
        }
    }
    void printNotlar(){
        System.out.println("======================================");
        System.out.println(this.ders1.ders + " Notu \t:" + this.ders1.not);
        System.out.println(this.ders2.ders + " Notu \t:" + this.ders2.not);
        System.out.println(this.ders3.ders + " Notu \t:" + this.ders3.not);
        System.out.println(this.ders4.ders + " Notu \t\t:" + this.ders4.not);
    }

    void sinifiGecerMi(){
        this.ortalama =(this.ders1.not + this.ders2.not + this.ders3.not + this.ders4.not) / 4.0;
        if (this.ortalama >= 50){
            System.out.println("======================================");
            System.out.println("Öğrenci Ortalaması :\t" + ortalama);
            System.out.println("Sınıfı Geçer");
            this.sinifiGecerMi = true;
        }else{
            System.out.println("======================================");
            System.out.println("Öğrenci Ortalaması :\t" + ortalama);
            System.out.println("Sınıfta Kalır");
            this.sinifiGecerMi = false;
        }
    }
}
