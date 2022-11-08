
/**
 * kelas Pelanggan untuk objek pelanggan
 *
 * @author Aditya Rizki Ramadhan & Aulia Muzhaffar
 * @version 1.0
 */
public class Pelanggan {
    private int totalBayar;
    private int totalTiket;

    /**
     * Constructor untuk objek Pelanggan tanpa paramter
     */
    public Pelanggan() {

    }

    /**
     * Constructor untuk objek Pelanggan tanpa paramter
     */
    public Pelanggan(int totalBayar, int totalTiket) {
        this.totalBayar = totalBayar;
        this.totalTiket = totalTiket;
    }

    /**
     * untuk menampilkan bill
     */
    public void setBill() {
        System.out.println("| Jumlah Tiket : " + this.totalTiket);
        System.out.println("| Total : Rp" + this.totalBayar);
        System.out.println("| Kode Tiket : AUDIAIR" + kodeBill());
        System.out.println("+===================================+");
    }

    /**
     * generate kode bill
     * 
     * @return kodebill
     */
    public String kodeBill() {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(5);

        for (int i = 0; i < 5; i++) {
            int index = (int) (AlphaNumericString.length() * Math.random());

            sb.append(AlphaNumericString.charAt(index));
        }

        return sb.toString();
    }
}
