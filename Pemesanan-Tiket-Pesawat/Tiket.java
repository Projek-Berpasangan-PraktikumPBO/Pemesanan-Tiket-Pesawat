
/**
 * Abstract class Tiket - write a description of the class here
 *
 * @author aditP
 * @version (version number or date here)
 */
public abstract class Tiket {
    private double harga_tiket;
    private int jumlahTiket;

    /**
     * Method contructor
     *
     */
    public Tiket() {

    }

    /**method ini untuk mendapatkan nilai harga tiket
     * @param hargaTiket
     */
    public Tiket(Double hargaTiket) {
        this.harga_tiket = hargaTiket;
    }

    /** 
     * Method untuk mendapatkan/mengembalikan harga tiket
     * @return harga_tiket
     */
    public double getHargaTiket() {
        return this.harga_tiket;
    }

    /**
     * method untuk menmasukkan/menampung harga baru
     * @param hargaBaru
     */
    public void setHarga(double hargaBaru) {
        this.harga_tiket = hargaBaru;
    }

    /**
     * method mengembalikan jumlah tiket
     * @return jummlah tiket
     */
    public int getJumlahTiket() {
        return this.jumlahTiket;
    }

    /**
     * Method untuk menampung jumlahtiket
     * @param jumlahTiket
     */
    public void setJumlahTiket(int jumlahTiket) {
        this.jumlahTiket = jumlahTiket;
    }

    /**
     * method abstrak
     * @param harga
     * @param jumlah
     * @return
     */
    abstract double getTotal(double harga, int jumlah);
}
