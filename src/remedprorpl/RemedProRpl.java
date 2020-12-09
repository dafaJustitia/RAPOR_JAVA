/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  remedprorpl  ;
import java.util.Scanner;
public class  RemedProRpl {
    static void nama() {
    System.out.println("Dafa Adham Justitia");}
    static void kelas() {
    System.out.println("X RPL 3 / 09");}
    static void usia() {
    System.out.println("Usia : " + (2020 - 2005));}
   
    public static void main(String[] args) {
        Scanner sken = new Scanner(System.in);
        int tugas1, tugas2, tugas3, nilaiMatematika, rerataMatematika;
        boolean keluar = true;
        String ulang;
       while( keluar ) {
        nama();
        kelas();
        usia();
        System.out.println("\n");
        System.out.println("Nilai Rapor MAT");
       
        System.out.print("Masukkan nilai tugas 1 anda :");
        tugas1 = sken.nextInt();
       
        System.out.print("Masukkan nilai tugas 2 anda :");
        tugas2 = sken.nextInt();
       
        System.out.print("Masukkan nilai tugas 3 anda :");
        tugas3 = sken.nextInt();
       
        nilaiMatematika = (tugas1 + tugas2 + tugas3);
        rerataMatematika = (nilaiMatematika / 3);
        System.out.println("Nilai rapor MAT anda = " + rerataMatematika);
       
        if (rerataMatematika >= 85) {
        System.out.println("Grade anda adalah A");}
       
        else if (rerataMatematika >= 75 && rerataMatematika <= 85) {
        System.out.println("Grade anda adalah B");}
       
        else if (rerataMatematika >= 70 && rerataMatematika <= 75) {
        System.out.println("Grade anda adalah C");}
       
        else {
        System.out.println("Mohon Maaf, anda tidak naik kelas");}
       
        System.out.println("\n");
       
           
            System.out.println("Apakah anda ingin keluar?");
            System.out.println("Jawab Ya atau Tidak ");
            ulang = sken.next();


           
            if (ulang.equalsIgnoreCase("ya") ){
                keluar = false;
            }
        }
    }
}
