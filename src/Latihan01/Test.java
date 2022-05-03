package Latihan01;

public class Test {
    public static void main(String[] args) {
        truk truk1 = new truk(4, "Kuning", "Solar", 1500, 1000);
        truk truk2 = new truk(6, "Merah", "Solar", 2000, 5000);

        //Membuat Objek taksi1 dan taksi2
        taksi taksi1 = new taksi(4, "Oranye", "Bensin", 1500, 10000, 5000);
        taksi taksi2 = new taksi(4, "Biru", "Bensin", 1300, 7000, 3500);

        //Membuat Objek sepeda1 dan sepeda2
        Sepeda sepeda1 = new Sepeda(3, "Hitam", "1", 2);
        Sepeda sepeda2 = new Sepeda(2, "Putih", "2", 5);

        //Menampilkan Objek
        System.out.println("===========================================");
        System.out.println("=====truk1=====");
        truk1.display();
        System.out.println("=====truk2=====");
        truk2.display();

        System.out.println("===========================================");
        System.out.println("=====taksi1=====");
        taksi1.display();
        System.out.println("=====taksi2=====");
        taksi2.display();

        System.out.println("===========================================");
        System.out.println("=====sepeda1=====");
        sepeda1.display();
        System.out.println("=====sepeda2=====");
        sepeda2.display();

    }
}
