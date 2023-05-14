package OgrenciBilgiSistemi;

public class Course {
    Teacher hocalar;
    String ders;
    int not;
    int sozlu;

//Bakın parametrenin ismi farklı çünkü yukarıdaki Teacher hocalar ile bağımsız parametredeki sadece görünüşte bir isim
    //Bakın altta ikisini eşitledik zaten.
    Course(String ders){
        this.ders = ders;
        int not = 0;  //Varsayılan olarak dersin notu 0 olarak belirledik
        int sozlu = 0;
    }


    void addTeacher(Teacher dersinHocasi){
        if(dersinHocasi.hocaAlan.equals(this.ders)){
            this.hocalar = dersinHocasi;
            printTeacherInfo();
        }else{
            System.out.println("Öğretmen ve ders bilgileri uyumsuz!!");
        }



    }

    void printTeacherInfo(){
        this.hocalar.print();
    }
}
