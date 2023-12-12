//public class Employee {pada baris ini terdapat kesalahan karena class tidak sesuai dengan class yang ada pada project
//public class Employee
public class Pegawai{
    public String nama;
    //public char asal; pada baris ini terdapat kesalahan karena tipe data char tidak bisa menyimpan tipe data string
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;
    public String getNama(){
        return nama;
    }
    public String getAsal(){
        return asal;
    }
    //public void setJabatan() pada baris ini terdapat kesalahan karena parameter yang diinputkan tidak sesuai
    //public void setJabatan()
    public void setJabatan(String j) {
        this.jabatan = j;
    }
    //menambahkan methode umur agar data muncul pada saat run di class Soal3Main
    public void setUmur(int u){
        this.umur = u;
    }
}

