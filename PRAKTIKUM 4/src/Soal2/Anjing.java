package Soal2;
class Anjing extends HewanPeliharaan {
    String warnaBulu;
    String[] kemampuan;
    Anjing(String nama, String ras, String warnaBulu, String kemampuan) {
        super(nama, ras);
        this.warnaBulu = warnaBulu;
        this.kemampuan = kemampuan.split(", ");
    }
    void displayDetailAnjing() {
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
        System.out.println("Memiliki Kemampuan : " + String.join(" ", kemampuan));
    }
}
