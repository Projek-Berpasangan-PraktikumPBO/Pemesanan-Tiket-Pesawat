import java.util.Scanner;

/**
 * kelas T_FirstClass untuk objek tiket first class
 *
 * @author Aditya Rizki Ramadhan & Aulia Muzhaffar
 * @version 1.0
 */
public class T_FirstClass extends Tiket {
    private int totalRun = 0;
    Scanner in = new Scanner(System.in);

    /**
     * turunan dari kelas tiket
     * ini constuctor T_First_Class untuk membuat objek tanpa parameter
     */
    public T_FirstClass() {
        super(1000000);
    }

    /**
     * turunan dari kelas tiket
     * ini constuctor T_First_Class untuk membuat objek dengan parameter
     * 
     * @param harga
     */
    public T_FirstClass(int harga) {
        super(harga);
    }

    /**
     * method ini untuk menyimpan jumlah tiket yang dipesan
     *
     * 
     * @return jumlah tiket yang dipesan
     */
    public void jumlah_tiket(int jumlah) {
        super.setJumlahTiket(getJumlahTiket() + jumlah);
        getTotal(super.getHargaTiket(), super.getJumlahTiket());
    }

    /**
     * method untuk menyimpan total harga tiket
     * 
     * @return total harga tiket
     */
    public int getTotalRun() {
        return this.totalRun;
    }

    /**
     * method untuk menyimpan total harga tiket setelah dijumlahkan
     * 
     * @param Subtotal
     */
    public void setTotalRun(int Subtotal) {
        this.totalRun = Subtotal;
    }

    /**
     * method ini untuk menjumlahkan harga tiket setelah diskon
     * 
     * @param harga
     * @param jumlah
     */
    public int getTotal(int harga, int jumlah) {
        int totalSementara = (harga * jumlah);
        System.out.println("| Subtotal: " + totalSementara);
        totalRun += totalSementara;
        return totalSementara;
    }

    /**
     * Method ini menghapus pesananan tiket
     * 
     * @param jumlah
     * @return
     */
    public int deletePesanan(int jumlah) {
        int temp = (getHargaTiket() * jumlah);
        return temp;
    }
}
