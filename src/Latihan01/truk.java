package Latihan01;

public class truk extends Mobil {
    protected int muatanMax;

    public int getMuatanMax() {
        return muatanMax;
    }

    public void setMuatanMax(int muatanMax) {
        this.muatanMax = muatanMax;
    }

    public truk(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin, int muatanMax) {
        super(jmlRoda, warna, bahanBakar, kapasitasMesin);
        this.muatanMax = muatanMax;
    }

    public void display () {
        System.out.println("Jumlah Roda         : " +jmlRoda);
        System.out.println("Warna               : " +warna);
        System.out.println("Bahan Bakar         : " +bahanBakar);
        System.out.println("Kapasitas Mesin     : " +kapasitasMesin);
        System.out.println("Muatan Maks         : " +muatanMax);
    }
}
