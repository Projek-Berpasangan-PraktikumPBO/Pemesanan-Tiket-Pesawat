import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Write a description of class T_Economy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class T_FirstClass extends Tiket
{
    private int totalRun = 0;
    private double diskon;
    Scanner in = new Scanner(System.in);
    
    /**
     * Constructor for objects of class T_Economy
     */
    public T_FirstClass()
    {
        // initialise instance variables
        super(5000000);
    }
    
    public T_FirstClass(int harga)
    {
        // initialise instance variables
        super(harga);
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int jumlah_tiket()
    {
        System.out.println("Masukkan jumlah tiket yang ingin dipesan");
        int jumlah = in.nextInt();
        super.setJumlahTiket(jumlah);
        getTotal(super.getHargaTiket(), super.getJumlahTiket());
        return jumlah;
    }
    
    public double getDiskon(){
        if (generateDiskon() == 0){
            setDiskon(0);
        } else if (generateDiskon() == 1){
            setDiskon(10.0);
        } else if (generateDiskon() == 2){
            setDiskon(20.0);
        } else {
            setDiskon(0);
        }
        double hasilDiskon = (this.diskon * super.getHargaTiket())/ 100;
        return hasilDiskon;
    }
    
    public void setDiskon(double diskon){
        this.diskon = diskon;
    }
    
    public double generateDiskon(){
        double disk;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++){
            list.add(i);
        }
        
        Collections.shuffle(list);
    
        disk = list.get(0);
        return disk;
    }
    
    public int getTotalRun(){
        return this.totalRun;
    }
    
    public double getTotal(int harga, int jumlah){
        double totalSementara = (harga * jumlah) - getDiskon();
        System.out.println("Subtotal: "+ totalSementara);
        totalRun += totalSementara;
        return totalSementara;
    }
}
