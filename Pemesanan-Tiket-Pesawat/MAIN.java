import java.util.Scanner;

/**
 * kelas Main untuk objek Main berfungsi untuk menjalankan semua kelas
 *
 * @author Aditya Rizki Ramadhan & Aulia Muzhaffar
 * @version 1.0
 */
public class MAIN {
    private boolean lagi;

    /**
     * Constructor untuk objek kelas MAIN
     */
    public MAIN() {
        lagi = true;
    }

    /**
     * Method untuk menampilkan jadwal penerbangan yang tersedia
     */
    public void Penerbangan() {
        System.out.println("+===================================+");
        System.out.println("| Penerbangan yang tersedia :       |");
        System.out.println("| * Banda Aceh - Jakarta            |");
        System.out.println("| * Banda Aceh - Batam              |");
        System.out.println("| * Banda Aceh - Medan              |");
    }

    /**
     * Method untuk menampilkan pilahan tiket
     */
    public void menuTiket() {
        System.out.println("| Pilihan Tiket :                   |");
        System.out.println("| 1. Tiket Ekonomy                  |");
        System.out.println("| 2. Tiket Bisnis Class             |");
        System.out.println("| 3. Tiket First Class              |");
    }

    /**
     * method ini akan mengembalikan jumlah dari tiap tiket
     * 
     * @param economy
     * @param bisnis
     * @param firstClass
     */
    public void totalTiket(int economy, int bisnis, int firstClass) {
        if ((economy > 0) && (bisnis <= 0) && (firstClass <= 0)) {
            System.out.println("| Tiket Ekonomi : " + economy + " tiket");
        } else if ((economy > 0) && (bisnis > 0) && (firstClass <= 0)) {
            System.out.println("| Tiket Ekonomi : " + economy + " tiket");
            System.out.println("| Tiket Bisnis  : " + bisnis + " tiket");
        } else if ((economy > 0) && (bisnis > 0) && (firstClass > 0)) {
            System.out.println("| Tiket Ekonomi : " + economy + " tiket");
            System.out.println("| Tiket Bisnis  : " + bisnis + " tiket");
            System.out.println("| Tiket First Class  : " + firstClass + " tiket");
        } else if ((economy <= 0) && (bisnis > 0) && (firstClass <= 0)) {
            System.out.println("| Tiket Bisnis  : " + bisnis + " tiket");
        } else if ((economy <= 0) && (bisnis > 0) && (firstClass > 0)) {
            System.out.println("| Tiket Bisnis  : " + bisnis + " tiket");
            System.out.println("| Tiket First Class  : " + firstClass + " tiket");
        } else if ((economy <= 0) && (bisnis <= 0) && (firstClass > 0)) {
            System.out.println("| Tiket First Class  : " + firstClass + " tiket");
        } else if ((economy <= 0) && (bisnis <= 0) && (firstClass <= 0)) {
            System.out.println("| Anda tidak memesan tiket");
        } else {
            System.out.println("Anda tidak membeli tiket");
        }
    }

    /**
     * method main yang akan menjalankan semua kode
     * 
     * @param args
     */
    public static void main(String[] args) {
        T_Economy economy = new T_Economy();
        T_Bisnis bisnis = new T_Bisnis();
        T_FirstClass firstClass = new T_FirstClass();
        Pelanggan customer;
        MAIN m = new MAIN();

        Scanner in = new Scanner(System.in);

        int pilbang, menu;
        int totalBayar, totalTiket;

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
                    economy.setHarga(2500000);
                    bisnis.setHarga(15000000);
                    firstClass.setHarga(50000000);

                    int jumlah;

                    System.out.println("+===================================+");
                    System.out.println("| Penerbangan Banda Aceh - Jakarta  |");
                    System.out.println("+===================================+");
                    m.menuTiket();
                    System.out.println("| 4. Hapus Pesanan                  |");
                    System.out.println("| 5. Selesai                        |");
                    System.out.println("+===================================+");
                    System.out.print("| Masukkan pilihan : ");
                    int tiket = in.nextInt();

                    switch (tiket) {
                        case 1:
                            System.out.println("| Harga tiket : " + economy.getHargaTiket());
                            System.out.print("| Masukkan jumlah tiket yang ingin dipesan : ");
                            jumlah = in.nextInt();
                            economy.jumlah_tiket(jumlah);
                            System.out.println("+===================================+");
                            break;
                        case 2:
                            System.out.println("| Harga tiket : " + bisnis.getHargaTiket());
                            System.out.print("| Masukkan jumlah tiket yang ingin dipesan : ");
                            jumlah = in.nextInt();
                            bisnis.jumlah_tiket(jumlah);
                            System.out.println("+===================================+");
                            break;
                        case 3:
                            System.out.println("| Harga tiket : " + firstClass.getHargaTiket());
                            System.out.print("| Masukkan jumlah tiket yang ingin dipesan : ");
                            jumlah = in.nextInt();
                            firstClass.jumlah_tiket(jumlah);
                            System.out.println("+===================================+");
                            break;
                        case 4:
                            m.menuTiket();
                            System.out.print("| Masukkan tiket yang ingin anda hapus:");
                            int delTiket = in.nextInt();
                            System.out.print("| Jumlah yang ingin dihapus :");
                            int jumTiket = in.nextInt();
                            if (delTiket == 1) {
                                economy.setTotalRun(economy.getTotalRun() - economy.deletePesanan(jumTiket));
                                economy.setJumlahTiket(economy.getJumlahTiket() - jumTiket);
                                System.out.println(economy.getHargaTiket());
                            } else if (delTiket == 2) {
                                bisnis.setTotalRun(bisnis.getTotalRun() - bisnis.deletePesanan(jumTiket));
                                System.out.println(bisnis.getHargaTiket());
                            } else if (delTiket == 3) {
                                firstClass.setTotalRun(firstClass.getTotalRun() - firstClass.deletePesanan(jumTiket));
                                System.out.println(firstClass.getHargaTiket());
                            } else {
                                System.out.println("error");
                            }
                            break;
                        case 5:
                            m.lagi = false;
                            totalBayar = economy.getTotalRun() + bisnis.getTotalRun() + firstClass.getTotalRun();
                            totalTiket = economy.getJumlahTiket() + bisnis.getJumlahTiket()
                                    + firstClass.getJumlahTiket();
                            customer = new Pelanggan(totalBayar, totalTiket);
                            System.out.println("+===================================+");
                            System.out.println("|                Bill               |");
                            System.out.println("+===================================+");
                            System.out.println("| Penerbangan Banda Aceh - Jakarta  |");
                            m.totalTiket(economy.getJumlahTiket(), bisnis.getJumlahTiket(),
                                    firstClass.getJumlahTiket());
                            customer.setBill();
                            System.out.println("---Terimakasi sudah percaya pada maskapai kami---");
                            break;
                        default:
                            System.out.println("Anda memasukkan opsi yang salah");
                    }
                } while (m.lagi);
            } else if (pilbang == 2) {
                do {
                    economy.setHarga(2300000);
                    bisnis.setHarga(14500000);
                    firstClass.setHarga(50000000);

                    System.out.println("+===================================+");
                    System.out.println("| Penerbangan Banda Aceh - Batam    |");
                    System.out.println("+===================================+");
                    m.menuTiket();
                    System.out.println("| 4. Hapus Pesanan                  |");
                    System.out.println("| 5. Selesai                        |");
                    System.out.println("+===================================+");
                    System.out.print("Masukkan pilihan : ");
                    int tiket = in.nextInt();

                    switch (tiket) {
                        case 1:
                            System.out.println("| Harga tiket : " + economy.getHargaTiket());
                            System.out.print("| Masukkan jumlah tiket yang ingin dipesan : ");
                            int jumlah = in.nextInt();
                            economy.jumlah_tiket(jumlah);
                            System.out.println("+===================================+");
                            break;
                        case 2:
                            System.out.println("| Harga tiket : " + bisnis.getHargaTiket());
                            System.out.print("| Masukkan jumlah tiket yang ingin dipesan : ");
                            jumlah = in.nextInt();
                            bisnis.jumlah_tiket(jumlah);
                            System.out.println("+===================================+");
                            break;
                        case 3:
                            System.out.println("| Harga tiket : " + firstClass.getHargaTiket());
                            System.out.print("| Masukkan jumlah tiket yang ingin dipesan : ");
                            jumlah = in.nextInt();
                            firstClass.jumlah_tiket(jumlah);
                            System.out.println("+===================================+");
                            break;
                        case 4:
                            m.menuTiket();
                            System.out.print("| Masukkan tiket yang ingin anda hapus:");
                            int delTiket = in.nextInt();
                            System.out.print("| Jumlah yang ingin dihapus :");
                            int jumTiket = in.nextInt();
                            if (delTiket == 1) {
                                economy.setTotalRun(economy.getTotalRun() - economy.deletePesanan(jumTiket));
                                System.out.println(economy.getHargaTiket());
                            } else if (delTiket == 2) {
                                bisnis.setTotalRun(bisnis.getTotalRun() - bisnis.deletePesanan(jumTiket));
                                System.out.println(bisnis.getHargaTiket());
                            } else if (delTiket == 3) {
                                firstClass.setTotalRun(firstClass.getTotalRun() - firstClass.deletePesanan(jumTiket));
                                System.out.println(firstClass.getHargaTiket());
                            } else {
                                System.out.println("error");
                            }
                        case 5:
                            m.lagi = false;
                            totalBayar = economy.getTotalRun() + bisnis.getTotalRun() + firstClass.getTotalRun();
                            totalTiket = economy.getJumlahTiket() + bisnis.getJumlahTiket()
                                    + firstClass.getJumlahTiket();
                            customer = new Pelanggan(totalBayar, totalTiket);
                            System.out.println("+===================================+");
                            System.out.println("|                Bill               |");
                            System.out.println("+===================================+");
                            System.out.println("| Penerbangan Banda Aceh - Batam    |");
                            m.totalTiket(economy.getJumlahTiket(), bisnis.getJumlahTiket(),
                                    firstClass.getJumlahTiket());
                            customer.setBill();
                            System.out.println("Terimakasi sudah percaya pada maskapai kami");
                            break;
                        default:
                            System.out.println("Anda memasukkan opsi yang salah");
                    }
                } while (m.lagi);
            } else if (pilbang == 3) {
                do {
                    economy.setHarga(1500000);
                    bisnis.setHarga(15000000);
                    firstClass.setHarga(30000000);

                    System.out.println("+===================================+");
                    System.out.println("| Penerbangan Banda Aceh - Medan    |");
                    System.out.println("+===================================+");
                    m.menuTiket();
                    System.out.println("| 4. Hapus Pesanan                  |");
                    System.out.println("| 5. Selesai                        |");
                    System.out.println("+===================================+");
                    System.out.print("Masukkan pilihan : ");
                    int tiket = in.nextInt();

                    switch (tiket) {
                        case 1:
                            System.out.println("| Harga tiket : " + economy.getHargaTiket());
                            System.out.print("| Masukkan jumlah tiket yang ingin dipesan : ");
                            int jumlah = in.nextInt();
                            economy.jumlah_tiket(jumlah);
                            System.out.println("+===================================+");
                            break;
                        case 2:
                            System.out.println("| Harga tiket : " + bisnis.getHargaTiket());
                            System.out.print("| Masukkan jumlah tiket yang ingin dipesan : ");
                            jumlah = in.nextInt();
                            bisnis.jumlah_tiket(jumlah);
                            System.out.println("+===================================+");
                            break;
                        case 3:
                            System.out.println("| Harga tiket : " + firstClass.getHargaTiket());
                            System.out.print("Masukkan jumlah tiket yang ingin dipesan : ");
                            jumlah = in.nextInt();
                            firstClass.jumlah_tiket(jumlah);
                            System.out.println("+===================================+");
                            break;
                        case 4:
                            m.menuTiket();
                            System.out.print("| Masukkan tiket yang ingin anda hapus:");
                            int delTiket = in.nextInt();
                            System.out.print("| Jumlah yang ingin dihapus :");
                            int jumTiket = in.nextInt();
                            if (delTiket == 1) {
                                economy.setTotalRun(economy.getTotalRun() - economy.deletePesanan(jumTiket));
                                System.out.println(economy.getHargaTiket());
                            } else if (delTiket == 2) {
                                bisnis.setTotalRun(bisnis.getTotalRun() - bisnis.deletePesanan(jumTiket));
                                System.out.println(bisnis.getHargaTiket());
                            } else if (delTiket == 3) {
                                firstClass.setTotalRun(firstClass.getTotalRun() - firstClass.deletePesanan(jumTiket));
                                System.out.println(firstClass.getHargaTiket());
                            } else {
                                System.out.println("error");
                            }
                        case 5:
                            m.lagi = false;
                            totalBayar = economy.getTotalRun() + bisnis.getTotalRun() + firstClass.getTotalRun();
                            totalTiket = economy.getJumlahTiket() + bisnis.getJumlahTiket()
                                    + firstClass.getJumlahTiket();
                            customer = new Pelanggan(totalBayar, totalTiket);
                            System.out.println("+===================================+");
                            System.out.println("|                Bill               |");
                            System.out.println("+===================================+");
                            System.out.println("| Penerbangan Banda Aceh - Medan    |");
                            m.totalTiket(economy.getJumlahTiket(), bisnis.getJumlahTiket(),
                                    firstClass.getJumlahTiket());
                            customer.setBill();
                            System.out.println("Terimakasi sudah percaya pada maskapai kami");
                            break;
                        default:
                            System.out.println("Anda memasukkan opsi yang salah");
                    }
                } while (m.lagi);
            } else {
                System.out.println("Anda memasukkan opsi yang salah");
            }
        }
        in.close();
    }
}
