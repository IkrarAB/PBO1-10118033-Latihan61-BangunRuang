
/**
 * 
 * @author 
 * NAMA  : Ikrar Anugrah Bastary
 * KELAS : PBO1
 * NIM   : 10118033
 * Deskripsi Program : Program ini berisi program untuk menampilkan volume
 *                     Bangun Ruang.
 *  
 */

package pbo1.pkg10118033.latihan61;

public class PBO110118033Latihan61 {
    public static void main(String[] args) {
        Bola bola1 = new Bola();
        bola1.setR(7);
        System.out.println("Jari-jari dari sebuah bola basket adalah "+bola1.getR()+" cm");
        System.out.printf("Hasil : V = %.1f cm³\n", bola1.hitungVolume());
        
        Tabung tabung1 = new Tabung();
        tabung1.setR(10);
        tabung1.setT(21);
        System.out.println("Sebuah tabung memiliki jari-jari berukuran "+tabung1.getR()+" cm. Jika tingginya "+tabung1.getT()+" cm.");
        System.out.printf("Hasil : V = %.1f cm³\n", tabung1.hitungVolume());
        
        Kerucut kerucut1 = new Kerucut();
        kerucut1.setR(14);
        kerucut1.setT(9);
        System.out.println("Diketahui tinggi sebuah kerucut "+kerucut1.getT()+" cm. Jika jari-jarinya "+kerucut1.getR()+" cm.");
        System.out.printf("Hasil : V = %.1f cm³\n", kerucut1.hitungVolume());
    }
}