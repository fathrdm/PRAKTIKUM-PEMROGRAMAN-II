public class objek {
    String namabuah;
    double berat;
    double harga;
    double jumlahbeli;
    double hargasebelum;
    double totaldiskon;
    double hargasetelah;
    int diskon;
    public objek(String namabuah, double berat, double harga, double jumlahbeli) {
        this.namabuah = namabuah;
        this.berat = berat;
        this.harga = harga;
        this.jumlahbeli = jumlahbeli;
    }
    void print() {
        hargasebelum = (jumlahbeli/berat)*harga;
        diskon = (int)(jumlahbeli/4);
        totaldiskon = (harga*0.08)*diskon;
        hargasetelah = hargasebelum-totaldiskon;
        System.out.println("Nama Buah : " + namabuah);
        System.out.println("Berat : " + berat );
        System.out.println("Harga : " + harga);
        System.out.println("Jumlah Beli : " + jumlahbeli +"Kg");
        System.out.println("Harga Sebelum Diskon : Rp" + String.format("%.02f", hargasebelum));
        System.out.println("Total Diskon : Rp" + String.format("%.02f", totaldiskon));
        System.out.println("Harga Setelah Diskon : Rp" + String.format("%.02f", hargasetelah));
        System.out.println();
    }
}
