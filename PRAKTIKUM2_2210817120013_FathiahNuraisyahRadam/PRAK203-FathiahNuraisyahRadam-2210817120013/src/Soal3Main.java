// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        //p1.nama = "Roi" Pada baris ini terjadi error karena kurangnya titik koma (;)
        //p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        //melakukan pemanggilan pada metode setUmur agar mengatur nilai umur dari objek p1 menjadi "17"
        p1.setUmur(17);
        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //System.out.println("Umur: " + p1.umur +); pada baris ini output hanya akan menghasilkan "Umur: 17" sehingga perlu menambahkan "tahun" setelahnya
        //System.out.println("Umur: " + p1.umur +);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}