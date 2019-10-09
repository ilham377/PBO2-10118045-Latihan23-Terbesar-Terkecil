/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan23nilaiterbesar.terkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama     :   Muhammad Ilham Apriyadi
 * Kelas    :   IF 2
 * NIM      :   10118045
 * Deskripsi Program : Program nilai terbesar dan terkecil
 */
public class PBO10118045Latihan23NilaiTerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static int Terbesar(int[] j){
        int max = j[0];
        for(int i = 1; i < j.length; i++){
            if (j[i] > max){
                max = j[i];
            }    
        }
        return max;
    }
    
     public static int Terkecil(int[] j){
        int min = j[0];
        for(int i = 1; i < j.length; i++){
            if (j[i] < min){
                min = j[i];
            }    
        }
        return min;
    }
            
            
    public static void main(String[] args) {
        // TODO code application logic here
        String Nama;
        System.out.println("====Program Nilai terbesar dan Terkecil Nilai Mahasiswa====");
        System.out.print("Masukkan Nama Petugas : ");
        Scanner petugas = new Scanner(System.in);
        Nama = petugas.next();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        Scanner banyak = new Scanner(System.in);
        int j = banyak.nextInt();
        int [] nilai = new int[j];
        for (int i = 0; i < j; i++){
            System.out.print("Nilai Mahasiswa ke-"+(1+i)+": " );
            Scanner skor = new Scanner(System.in);
            nilai[i] = skor.nextInt();         
        }
        System.out.println("");
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        for (int i = 0; i < j; i++){
            System.out.println("Nilai Mahasiswa ke-"+(1+i)+": " +nilai[i] );            
        }    
        System.out.println("");
        System.out.println("Nilai Terbesar adalah " +Terbesar(nilai)) ;
        System.out.println("Nilai Terkecil adalah " +Terkecil(nilai));
        System.out.println("");
        System.out.println("Petugasa : " +Nama);
        
    }
    
}
