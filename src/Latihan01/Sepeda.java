package Latihan01;

public class Sepeda extends Kendaraan {
    protected String jmlSadel;
    protected int jmlGir;

    public String getJmlSadel() {
        return jmlSadel;
    }

    public void setJmlSadel(String jmlSadel) {
        this.jmlSadel = jmlSadel;
    }

    public int getJmlGir() {
        return jmlGir;
    }

    public void setJmlGir(int jmlGir) {
        this.jmlGir = jmlGir;
    }

    public Sepeda(int jmlRoda, String warna, String jmlSadel, int jmlGir) {
        super(jmlRoda, warna);
        this.jmlSadel = jmlSadel;
        this.jmlGir = jmlGir;
    }

    public void display () {
        System.out.println("Jumlah Roda     : " +jmlRoda);
        System.out.println("Warna           : " + warna);
        System.out.println("Jumlah Sadel    : " +jmlSadel);
        System.out.println("Jumlah Gir      : " +jmlGir);
    }
}
