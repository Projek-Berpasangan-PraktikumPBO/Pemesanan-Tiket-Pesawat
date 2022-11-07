
/**
 * Abstract class Tiket - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Tiket {
    private double harga_tiket;
    private int jumlahTiket;

    /**
     * An example of a method - replace this comment with your own
     *
     * @param y a sample parameter for a method
     * @return the sum of x and y
     */
    public Tiket() {

    }

    public Tiket(Double hargaTiket) {
        this.harga_tiket = hargaTiket;
    }

    public double getHargaTiket() {
        return this.harga_tiket;
    }

    public void setHarga(double hargaBaru) {
        this.harga_tiket = hargaBaru;
    }

    public int getJumlahTiket() {
        return this.jumlahTiket;
    }

    public void setJumlahTiket(int jumlahTiket) {
        this.jumlahTiket = jumlahTiket;
    }

    abstract double getTotal(double harga, int jumlah);
}
