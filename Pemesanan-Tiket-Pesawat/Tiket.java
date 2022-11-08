
/**
 * Abstract
 *
 * @author Aditya Rizki Ramadhan & Aulia Muzhaffar
 * @version 1.0
 */
public abstract class Tiket {
    private int harga_tiket;
    private int jumlahTiket;

    /**
     * Method contructor
     *
     */
    public Tiket() {

    }

    /**
     * method ini untuk mendapatkan nilai harga tiket
     * 
     * @param hargaTiket
     */
    public Tiket(int hargaTiket) {
        this.harga_tiket = hargaTiket;
    }

    /**
     * Method untuk mendapatkan/mengembalikan harga tiket
     * 
     * @return harga_tiket
     */
    public int getHargaTiket() {
        return this.harga_tiket;
    }

    /**
     * method untuk menmasukkan/menampung harga baru
     * 
     * @param hargaBaru
     */
    public void setHarga(int hargaBaru) {
        this.harga_tiket = hargaBaru;
    }

    /**
     * method mengembalikan jumlah tiket
     * 
     * @return jummlah tiket
     */
    public int getJumlahTiket() {
        return this.jumlahTiket;
    }

    /**
     * Method untuk menampung jumlahtiket
     * 
     * @param jumlahTiket
     */
    public void setJumlahTiket(int jumlahTiket) {
        this.jumlahTiket = jumlahTiket;
    }

    /**
     * method abstrak
     * 
     * @param harga
     * @param jumlah
     * @return
     */
    abstract int getTotal(int harga, int jumlah);
}
