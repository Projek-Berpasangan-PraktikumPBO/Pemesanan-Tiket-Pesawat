import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 * kelas T_FirstClass untuk objek tiket first class
 *
 * @author Aditya Rizki Ramadhan & Aulia Muzhaffar
 * @version 1.0
 */
public class T_FirstClass extends Tiket {
    private double totalRun = 0;
    private double diskon;
    Scanner in = new Scanner(System.in);

    /**
     * turunan dari kelas tiket
     * ini  constuctor T_First_Class untuk membuat objek tanpa parameter
     */
    public T_FirstClass() {
        super(1000000.0);
    }

    /**
     * turunan dari kelas tiket
     * ini  constuctor T_First_Class untuk membuat objek dengan parameter
     * @param harga
     */
    public T_FirstClass(Double harga) {
        super(harga);
    }

    /**
     * method ini untuk menyimpan jumlah tiket yang dipesan
     *
     * 
     * @return jumlah tiket yang dipesan
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
        if (generateDiskon() == 0) {
            setDiskon(0);
        } else if (generateDiskon() == 1) {
            setDiskon(10.0);
        } else if (generateDiskon() == 2) {
            setDiskon(20.0);
        } else {
            setDiskon(0);
        }
        double hasilDiskon = (this.diskon * super.getHargaTiket()) / 100;
        return hasilDiskon;
    }

    /**
     * method untuk menyimpan nilai diskon
     * @param diskon
     */
    public void setDiskon(double diskon) {
        this.diskon = diskon;
    }

    /**
     * method untuk memberikan nilai acak pada costumer apakah costumer ini mendapatkan diskon apa tidak.
     * @return disk
     */
    public double generateDiskon() {
        double disk;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            list.add(i);
        }

        Collections.shuffle(list);

        disk = list.get(0);
        return disk;
    }

    /**
     * method untuk menyimpan total harga tiket
     * @return total harga tiket
     */
    public double getTotalRun() {
        return this.totalRun;
    }

    /** 
     * method untuk menyimpan total harga tiket setelah dijumlahkan
     * @param Subtotal
     */
    public void setTotalRun(double Subtotal) {
        this.totalRun = Subtotal;
    }

    /**
     * method ini untuk menjumlahkan harga tiket setelah diskon
     * @param  harga 
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
     * @param jumlah
     * @return
     */
    public double deletePesanan(int jumlah) {
        double temp = (getHargaTiket() * jumlah) + getDiskon();
        return temp;
    }
}
