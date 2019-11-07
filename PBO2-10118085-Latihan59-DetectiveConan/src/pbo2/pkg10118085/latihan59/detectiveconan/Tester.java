/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118085.latihan59.detectiveconan;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Risky Irfansyah
 * KELAS    : IF-2
 * NIM      : 10118085
 * Deskripsi Program : Membuat program dengan pendekatan berbasis objek untuk menampilkan
 * tokoh dalam detektif konan berdasarkan keahlian setiap tokoh
 */
public class Tester {

   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Tokoh tokoh = new Tokoh();
        
        System.out.println("===Tokoh Dalam Detektif Konan===");
        System.out.println("---Berdasarkan Keahliannya---");
        tokoh.tampilDaftarKeahlian();
        tokoh.setKeahlian(sc.nextInt());
        
        System.out.println("");
        
        tokoh.tampilKeahlian(tokoh.getKeahlian());
    }
    
}