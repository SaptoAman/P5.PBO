package Test;

import java.util.List;
import java.util.ArrayList;
import akun_bank.Tabungan;
import perguruan_tinggi.Mahasiswa;
import perguruan_tinggi.kelas;

public class testMahasiswa {
    public static void main(String[] args) {
        //Buat 4 Objek Mahasiswa Atas Nama Anton, Budi, Clarisa dan Dono
        Mahasiswa anton = new Mahasiswa(1106310,"Anton");
        Mahasiswa budi = new Mahasiswa(1106311,"Budi");
        Tabungan tbudi = new Tabungan(1,100000);
        budi.setTabungan(tbudi);
        Mahasiswa clarisa = new Mahasiswa(1106312,"Clarisa");
        Tabungan tclarisa = new Tabungan(2,150000);
        clarisa.setTabungan(tclarisa);
        Mahasiswa dono = new Mahasiswa(1106313,"Dono");
        Tabungan tdono = new Tabungan(3,200000);
        dono.setTabungan(tdono);

        //Membuat 2 Objek Kelas Yaitu kelasRPL dan kelasTI
        kelas kelasRPL = new kelas(1,"Kelas RPL");
        kelas kelasTI = new kelas(2,"Kelas TI");

        //Buat Sebuah 2 Objek List Mahasiswa Yaiut daftarMahasiswaRPL dan daftarMahasiswaTI
        List <Mahasiswa> daftarMahasiswaRPL = new ArrayList<>();
        daftarMahasiswaRPL.add(anton);
        daftarMahasiswaRPL.add(clarisa);
        kelasRPL.setDaftarMahasiswa(daftarMahasiswaRPL);

        List <Mahasiswa> daftarMahasiswaTI = new ArrayList<>();
        daftarMahasiswaTI.add(budi);
        daftarMahasiswaTI.add(dono);
        kelasTI.setDaftarMahasiswa(daftarMahasiswaTI);

        System.out.println("Data Kelas RPL\n" +kelasRPL.toString());
        System.out.println("\nData Kelas TI\n" +kelasTI.toString());
    }
}
