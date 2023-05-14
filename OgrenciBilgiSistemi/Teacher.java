package OgrenciBilgiSistemi;

public class Teacher {
    String hocaName;
    String hocaAlan;

    Teacher(String hocaName, String hocaAlan){

        //Constructer'ı scape içindeki ile eşitliyoruz this.xyz = xyz;
        this.hocaAlan = hocaAlan;
        this.hocaName = hocaName;
    }
    //deneme
    void print(){
        System.out.println("======================================");
        System.out.println("Öğretmen Adı\t: " + this.hocaName);
        System.out.println("Alanı\t\t\t: " + this.hocaAlan);
    }
}
