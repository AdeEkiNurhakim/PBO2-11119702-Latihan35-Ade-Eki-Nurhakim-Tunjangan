/*Nama 	 : Ade Eki Nurhakim
NIM 	 : 10119702
Fakultas : Teknik Dan Ilmu Komputer
Prodi 	 : Teknik Informatika
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg11119702.latihan17.ade.eki.nurhakim;
import java.util.Scanner;
/**
 *
 * @author Ekiw
 */
public class PBO211119702Latihan17AdeEkiNurhakim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gajiPokok, total, tunjangan;
        tunjangan = 2100000;
         Scanner input = new Scanner(System.in);
         String status;
         System.out.println("======= Program Tunjangan =======");
         System.out.print("Status Anda ? (Menikah/Tidak): ");
            status = input.nextLine();
         System.out.print("Berapa Gaji Pokok Perbulan anda: ");
            gajiPokok = input.nextDouble();
        switch(status){
            case "menikah":
         System.out.println("======= Hasil Perhitungan  =======");
         System.out.println("Gaji Pokok  :Rp. " +gajiPokok);
         System.out.println("Tunjangan :Rp. "+ tunjangan);
         total = gajiPokok + tunjangan;
         System.out.println("Total :Rp " + total);
         break;
          case "tidak":
         System.out.println("======= Hasil Perhitungan  =======");
         System.out.println("Gaji Pokok  : " +gajiPokok);
         System.out.println("Tunjangan : ");
         System.out.println("Total : " + gajiPokok);
         break;
          default:
              System.out.println("Maaf Anda Salah Input data !!!");
    }
}
}
