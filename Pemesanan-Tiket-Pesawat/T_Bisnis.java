import java.util.Scanner;

/**
 * kelas T_bisnis untuk objek tiket bisnis
 *
 * @author Aditya Rizki Ramadhan & Aulia Muzhaffar
 * @version 1.0
 */
public class T_Bisnis extends Tiket {
    private double totalRun = 0;
    Scanner in = new Scanner(System.in);

    /**
     * Constructor untuk objek T_Bisnis tanpa paramter
     */
    public T_Bisnis() {
        super(2500000.0);
    }

    /**
     * Constructor untuk objek T_Bisnis dengan paramter
     * 
     * @param harga
     */
    public T_Bisnis(double harga) {
        super(harga);
    }

    /**
     * method ini untuk menyimpan jumlah tiket yang dipesan
     * 
     * @return jumlah tiket yang dipsan
     */
    public void jumlah_tiket(int jumlah) {
        super.setJumlahTiket(jumlah);
        getTotal(super.getHargaTiket(), super.getJumlahTiket());
    }

    /**
     * method untuk menyimpan total harga tiket
     * 
     * @return total harga tiket
     */
    public double getTotalRun() {
        return this.totalRun;
    }

    /**
     * method untuk menyimpan total harga tiket setelah dijumlahkan
     * 
     * @param Subtotal
     */
    public void setTotalRun(double Subtotal) {
        this.totalRun = Subtotal;
    }

    /**
     * method ini untuk menjumlahkan harga tiket setelah diskon
     * 
     * @param harga
     * @param jumlah
     */
    public double getTotal(double harga, int jumlah) {
        double totalSementara = (harga * jumlah);
        System.out.println("Subtotal: " + totalSementara);
        totalRun += totalSementara;
        return totalSementara;
    }

    /**
     * Method ini menghapus pesananan tiket
     * 
     * @param jumlah
     * @return
     */
    public double deletePesanan(int jumlah) {
        double temp = (getHargaTiket() * jumlah);
        return temp;
    }
}
