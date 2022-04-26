package mahasiswa;

public class Mahasiswa {

    private String nama;
    private int nrp;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNrp() {
        return nrp;
    }

    public void setNrp(int nrp) {
        this.nrp = nrp;
    }

    public Mahasiswa(String nama, int nrp){
        this.nama = nama;
        this.nrp = nrp;
    }

    void info(){
        System.out.println(nama+'\n'+nrp);
    }

    @Override
    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append("Nama = ").append(nama);
        sb.append(", nrp = ").append(nrp);
        return sb.toString();
    }
}
