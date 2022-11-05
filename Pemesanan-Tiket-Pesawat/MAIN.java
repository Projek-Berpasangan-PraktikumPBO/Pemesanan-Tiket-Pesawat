import java.util.Scanner;

/**
 * Write a description of class MAIN here.
 *
 * @author Aditya Rizki Ramadhan & Aulia Muzhaffar
 * @version (a version number or a date)
 */
public class MAIN {
    // instance variables - replace the example below with your own
    private boolean lagi;

    /**
     * Constructor for objects of class MAIN
     */
    public MAIN() {
        lagi = true;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param y a sample parameter for a method
     * @return the sum of x and y
     */
    public void lagi() {

    }

    public void Penerbangan() {
        System.out.println("+===================================+");
        System.out.println("| Penerbangan yang tersedia :       |");
        System.out.println("| * Banda Aceh - Jakarta            |");
        System.out.println("| * Banda Aceh - Batam              |");
        System.out.println("| * Banda Aceh - Medan              |");
    }

    public void menuTiket() {
        System.out.println("| Pilihan Tiket :                   |");
        System.out.println("| 1. Tiket Ekonomy                  |");
        System.out.println("| 2. Tiket Bisnis Class             |");
        System.out.println("| 3. Tiket First Class              |");
        System.out.println("| 4. Selesai                        |");
    }

    public static void main(String[] args) {
        T_Economy economy = new T_Economy();
        T_Bisnis bisnis = new T_Bisnis();
        T_FirstClass firstClass = new T_FirstClass();
        Pelanggan customer = new Pelanggan();
        MAIN m = new MAIN();

        Scanner in = new Scanner(System.in);

        int pilbang, menu;
        double totalBayar;

        System.out.println("+===================================+");
        System.out.println("|Selamat Datang Di Maskapai AUDI AIR|");

        do {
            System.out.println("+===================================+");
            System.out.println("| 1. Pilih Penerbangan              |");
            System.out.println("| 2. Cek Penerbangan Yang tersedia  |");
            System.out.println("+===================================+");
            System.out.print("| Pilihan : ");
            menu = in.nextInt();
            if (menu == 2) {
                m.Penerbangan();
            }
        } while (menu != 1 && (menu > 0 && menu < 3));
        System.out.println("+===================================+");
        if (menu == 1) {
            System.out.println("|        Pilihan Penerbangan        |");
            System.out.println("| 1. Banda Aceh - Jakarta           |");
            System.out.println("| 2. Banda Aceh - Batam             |");
            System.out.println("| 3. Banda Aceh - Medan             |");
            System.out.println("+===================================+");
            System.out.print("| Pilih : ");
            pilbang = in.nextInt();

            if (pilbang == 1) {
                do {
                    System.out.println("| Penerbangan Banda Aceh - Jakarta  |");
                    System.out.println("+===================================+");
                    m.menuTiket();
                    System.out.println("+===================================+");
                    System.out.print("Masukkan pilihan : ");
                    int tiket = in.nextInt();

                    switch (tiket) {
                        case 1:
                            economy.setHarga(2500000);
                            System.out.println("Harga tiket : " + economy.getHargaTiket());
                            economy.jumlah_tiket();
                            System.out.println("Mendapat potongan diskon sebesar Rp" + economy.getDiskon());
                            System.out.println("+===================================+");
                            break;
                        case 2:
                            bisnis.jumlah_tiket();
                            break;
                        case 3:
                            firstClass.jumlah_tiket();
                            break;
                        case 4:
                            m.lagi = false;
                            totalBayar = economy.getTotalRun() + bisnis.getTotalRun() + firstClass.getTotalRun();
                            System.out.println(totalBayar);
                            System.out.println("Terimakasi sudah percaya pada maskapai kami");
                            break;
                        default:
                            System.out.println("Anda memasukkan opsi yang salah");
                    }
                } while (m.lagi);
            } else if (pilbang == 2) {
                do {
                    System.out.println("| Penerbangan Banda Aceh - Batam    |");
                    System.out.println("+===================================+");
                    m.menuTiket();
                    System.out.println("+===================================+");
                    System.out.print("Masukkan pilihan : ");
                    int tiket = in.nextInt();

                    switch (tiket) {
                        case 1:
                            economy.jumlah_tiket();
                            break;
                        case 2:
                            bisnis.jumlah_tiket();
                            break;
                        case 3:
                            firstClass.jumlah_tiket();
                            break;
                        case 4:
                            m.lagi = false;
                            totalBayar = economy.getTotalRun() + bisnis.getTotalRun() + firstClass.getTotalRun();
                            System.out.println(totalBayar);
                            System.out.println("Terimakasi sudah percaya pada maskapai kami");
                            break;
                        default:
                            System.out.println("Anda memasukkan opsi yang salah");
                    }
                } while (m.lagi);
            } else if (pilbang == 3) {
                do {
                    System.out.println("| Penerbangan Banda Aceh - Medan    |");
                    System.out.println("+===================================+");
                    m.menuTiket();
                    System.out.println("+===================================+");
                    System.out.print("Masukkan pilihan : ");
                    int tiket = in.nextInt();

                    switch (tiket) {
                        case 1:
                            economy.jumlah_tiket();
                            break;
                        case 2:
                            bisnis.jumlah_tiket();
                            break;
                        case 3:
                            firstClass.jumlah_tiket();
                            break;
                        case 4:
                            m.lagi = false;
                            totalBayar = economy.getTotalRun() + bisnis.getTotalRun() + firstClass.getTotalRun();
                            System.out.println(totalBayar);
                            System.out.println("Terimakasi sudah percaya pada maskapai kami");
                            break;
                        default:
                            System.out.println("Anda memasukkan opsi yang salah");
                    }
                } while (m.lagi);
            }
        }

    }
}
