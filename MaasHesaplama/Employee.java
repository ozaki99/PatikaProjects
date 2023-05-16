package MaasHesaplama;

public class Employee {
    String name;
    String surname;
    int salary;
    int workHours;
    int hireYear;

    Employee(String isim, String soyisim, int maas, int haftalikCalismaSaati, int iseBaslamaYili) {
        this.name = isim;
        this.surname = soyisim;
        this.salary = maas;
        this.workHours = haftalikCalismaSaati;
        this.hireYear = iseBaslamaYili;
    }

    double tax() {
        if (salary <= 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    double bonus() {
        if (workHours > 40) {
            int mesai = workHours - 40;
            return mesai * 30;
        } else {
            return 0;
        }
    }

        void printInformations () {
            System.out.println("Adı: " + this.name + "\nSoyadı: " + this.surname);
            System.out.println("Maaşı: " + this.salary);
            System.out.println("Çalışma saati: " + this.workHours + "\nBaşlangıç Yılı: " + this.hireYear);
            System.out.println("Vergi: " + this.tax());
            System.out.println("Toplam Mesai: " + this.bonus());
            this.salary -= this.tax();
            this.salary += this.bonus();
            System.out.println("Toplam maaş + Mesai - Vergi = " + this.salary);
        }
}
