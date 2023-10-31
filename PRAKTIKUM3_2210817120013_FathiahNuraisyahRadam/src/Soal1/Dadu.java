package Soal1;
import java.util.Random;
public class Dadu {
    int nilai;
    Dadu() {
        nilaiacak();
    }
    void nilaiacak() {
        Random acak = new Random();
        nilai = acak.nextInt(6) + 1;
    }
    int getNilai() {
        return nilai;
    }
}
