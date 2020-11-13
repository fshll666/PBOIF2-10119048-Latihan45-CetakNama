/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan45.cetaknama;

import java.util.Scanner;
/**
 *
 * @author SystemOs
 * Nama      : Mochammad Faishal
 * NIM       : 10119048
 * Kelas     : IF2
 * Deskripsi : Menampilkan program pencetakan nama.
 */
public class PBOIF210119048Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Printer printer = new Printer();
        
        System.out.printf("=====Aplikasi Pencetak Nama=====\n");
        System.out.printf("Masukkan nama anda : "); printer.setNama(scanner.nextLine());
        System.out.printf("Mau cetak nama berapa kali? : "); printer.setJmlCetak(scanner.nextInt());
        printer.cetak(printer.getNama());
        printer.cetak(printer.getJmlCetak(),printer.getNama());
        System.out.println("==========================================");
        System.out.println("Developed by : Mochammad Faishal");
    }
    
}
