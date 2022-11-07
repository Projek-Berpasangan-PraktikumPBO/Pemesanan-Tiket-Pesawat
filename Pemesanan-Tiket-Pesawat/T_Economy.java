import java.util.Scanner;

/**
 * kelas T_Economy untuk objek tiket economy
 *
 * @author Aditya Rizki Ramadhan & Aulia Muzhaffar
 * @version 1.0
 */
public class T_Economy extends Tiket {
    private double totalRun = 0;
    private double diskon;
    Scanner in = new Scanner(System.in);

    /**
     * Constructor untuk objek t_Economy tanpa paramter
     */
    public T_Economy() {
        super(1000000.0);
    }

    /**
     * Constructor untuk objek t_Economy dengan paramter
     * 
     * @param harga
     */
    public T_Economy(Double harga) {
        super(harga);
    }

    /**
     * method ini untuk menyimpan jumlah tiket yang dipesan
     * 
     * @return jumlah tiket yang dipsan
     */
    public int jumlah_tiket() {
        System.out.println("Masukkan jumlah tiket yang ingin dipesan");
        int jumlah = in.nextInt();
        super.setJumlahTiket(jumlah);
        getTotal(super.getHargaTiket(), super.getJumlahTiket());
        return jumlah;
    }

    /**
     * method ini untuk mengembalikan banyaknya diskon yang
     * didapat.
     * 
     * @return hasilDiskon
     */
    public double getDiskon() {
        double hasilDiskon;
        if (jumlah_tiket() == 2) {
            hasilDiskon = (this.diskon * super.getHargaTiket()) / 100;
        } else {
            hasilDiskon = 0;
        }
        return hasilDiskon;
    }

    /**
     * method untuk menyimpan nilai diskon
     * 
     * @param diskon
     */
    public void setDiskon(double diskon) {
        this.diskon = diskon;
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
        double totalSementara = (harga * jumlah) - getDiskon();
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
        double temp = (getHargaTiket() * jumlah) + getDiskon();
        return temp;
    }
}
