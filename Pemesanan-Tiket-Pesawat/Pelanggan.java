
/**
 * kelas Pelanggan untuk objek pelanggan
 *
 * @author Aditya Rizki Ramadhan & Aulia Muzhaffar
 * @version 1.0
 */
public class Pelanggan {
    private double totalBayar;
    private int totalTiket;

    /**
     * Constructor untuk objek Pelanggan tanpa paramter
     */
    public Pelanggan() {

    }

    /**
     * Constructor untuk objek Pelanggan tanpa paramter
     */
    public Pelanggan(double totalBayar, int totalTiket) {
        this.totalBayar = totalBayar;
        this.totalTiket = totalTiket;
    }

    public void setBill(double totalBayar, int totalTiket) {
        System.out.println("");
    }

    public String kodeBill() {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(12);

        for (int i = 0; i < 12; i++) {
            int index = (int) (AlphaNumericString.length() * Math.random());

            sb.append(AlphaNumericString.charAt(index));
        }

        return sb.toString();
    }
}
