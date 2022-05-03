package Latihan01;

public class Kendaraan {
    protected int jmlRoda;
    protected String warna;

    public int getJmlRoda() {
        return jmlRoda;
    }

    public void setJmlRoda(int jmlRoda) {
        this.jmlRoda = jmlRoda;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public Kendaraan(int jmlRoda, String warna) {
        this.jmlRoda = jmlRoda;
        this.warna = warna;
    }
}
