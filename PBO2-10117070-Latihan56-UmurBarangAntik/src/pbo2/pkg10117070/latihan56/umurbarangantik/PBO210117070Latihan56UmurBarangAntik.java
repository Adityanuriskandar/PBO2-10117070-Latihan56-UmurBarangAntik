/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan56.umurbarangantik;

/**
 *
 * @author Aditya
 * NAMA                 : Aditya Nur Iskandar
 * KELAS                : PBO2
 * NIM                  : 10117070
 * Deskripsi Program    : Program ini berisi program untuk menghitung umur
 * barang antik
 */
public class PBO210117070Latihan56UmurBarangAntik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Radio r = new Radio(234);
        r.setName("Radio AM");
        System.out.println("Nama barang antik ini : " + r.getName());
        r.tampilUmur();
    }
    
}
