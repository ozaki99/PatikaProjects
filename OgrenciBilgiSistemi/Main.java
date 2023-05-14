package OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher hoca1 = new Teacher("Ahmet Uzunbaş", "Bilişim");
        Teacher hoca2 = new Teacher("Rabia Kaçakçı", "İngilizce");
        Teacher hoca3 = new Teacher("Fatih Gökyaran", "Matematik");
        Teacher hoca4 = new Teacher("Giray Giricioğlu", "Tarih");

        Course bilisim = new Course("Bilişim");
        Course ingilizce = new Course("İngilizce");
        Course matematik = new Course("Matematik");
        Course tarih = new Course("Tarih");

//Burada hata yapmışım böyle yazmıştım Course bilisim = new Course("Bilişim", "Mustafa Öztürk"); Ama Mustafa öztürk yerine hoca1 yazmalıyız

        bilisim.addTeacher(hoca1);
        ingilizce.addTeacher(hoca2);
        matematik.addTeacher(hoca3);
        tarih.addTeacher(hoca4);

        Student ogrenci1 = new Student("Elif Çalışmaz", "031", "12-E", bilisim, ingilizce, matematik, tarih);
        ogrenci1.SinavNotlari(95, 100, 50, 70);
        ogrenci1.printOgrenciBilgileri();
        ogrenci1.printNotlar();
        ogrenci1.sinifiGecerMi();

        Student ogrenci2 = new Student("Kemal İncetelli", "9125", "12-E", bilisim, ingilizce, matematik, tarih);
        ogrenci2.SinavNotlari(67, 20, 100, 5);
        ogrenci2.printOgrenciBilgileri();
        ogrenci2.printNotlar();
        ogrenci2.sinifiGecerMi();
    }
}
