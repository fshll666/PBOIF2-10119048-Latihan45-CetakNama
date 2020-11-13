/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119048.latihan45.cetaknama;

/**
 *
 * @author SystemOs
 * Nama      : Mochammad Faishal
 * NIM       : 10119048
 * Kelas     : IF2
 * Deskripsi : Berisi program pencetakan nama.
 */
public class Printer {
    private int jmlCetak;
    private String nama;
    
    public int getJmlCetak(){
        return jmlCetak;
    }
    
    public void setJmlCetak(int jmlCetak){
        this.jmlCetak = jmlCetak;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void cetak(String nama){
        System.out.printf("Nama Anda : %s\n", nama);
    }
    
    public void cetak(int jlmCetak, String nama){
        int i = 0;
        
        System.out.printf("Hasil Cetak : \n");
        while(i < jmlCetak){
           System.out.printf("%d. %s\n", i+1 ,nama);
           i++;
        }
    }  
}
