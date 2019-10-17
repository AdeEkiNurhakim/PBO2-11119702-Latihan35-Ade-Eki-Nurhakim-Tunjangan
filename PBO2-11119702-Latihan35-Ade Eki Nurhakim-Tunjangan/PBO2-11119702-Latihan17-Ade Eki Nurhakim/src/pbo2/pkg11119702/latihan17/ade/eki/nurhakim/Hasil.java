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
public class Hasil {
    public static void main(String[] args) {
        int i;
        float total, tunjangan, gajiPokok;
        tunjangan = 2100000;
         Scanner input = new Scanner(System.in);
        String nama, status;
         System.out.println("======= Program Tunjangan =======");
         System.out.print("Berapa Gaji Pokok Perbulan anda: ");
            gajiPokok = input.nextFloat();
         System.out.print("Status Anda (Menikah/Tidak) :  ");
            i= input.nextInt();
  
        System.out.println("======= Hasil Perhitungan Gaji =======");
        System.out.println("Gaji Pokok\t : "+ gajiPokok);
        System.out.println("Tunjangan\t : "+ tunjangan);
        total = (float) (gajiPokok+tunjangan);
        System.out.println("Total Gaji\t : " + total);
    }
}
