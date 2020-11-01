/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119045.latihan23.nilaiterbesardanterkecil;
import java.util.Scanner;
/**
 *
 * @author Legion
 * NAMA                : Fahma Maulana
 * KELAS               : PBOIF2
 * NIM                 : 10119045
 * Deskripsi Program   : Nilai TerBesar dan Terkecil
 */
public class PBOIF210119045Latihan23NilaiterBesardanterKecil {

            public static int max(int max,int nilai [],int n) {
            max=nilai[1];
            for (int i = 1 ; i<=n; i++) {
                if(nilai [i] > max ) {
                    max = nilai[i];
                }
            }
            return max;
        }
           
          public static int min(int min,int nilai[],int n ) {
              min=nilai[1];
              for(int i=1; i<=n; i++){
                  if(nilai [i] < min ){
                      min = nilai[i];
                  }
              }
             return min;
          }
  
         public static void main(String[]args) {
             int[]nilai = new int [10];
             int n;
             int max = 0;
             int min = 0;
             String nama;
             
             Scanner input = new Scanner (System.in);
             System.out.println("===== Program Nilai Terbesar dan Terkecil Nilai Mahasiswa =====");
             System.out.print("Masukan Nama Petugas : ");
             nama = input.next();
             System.out.print("Masukan Banyak Nilai Mahasiswa : ");
             n = input.nextInt();
             
                for(int i=1; i<=n; i++) {
                    System.out.print("Nilai Mahasiswa ke-" + i + " = ");
                    nilai[i] = input.nextInt();
                }
                System.out.println("");
                System.out.println("===== Hasil Nilai Mahasiswa =====");
                for (int i=1; i<=n; i++) {
                    System.out.println("Nilai Mahasiswa ke-" + 1 + " = "+nilai[i]);
                }
                System.out.println("");
                System.out.println("Nilai Terbesar Adalah" + max(max,nilai,n));
                System.out.println("Nilai Kecil Adalah" + min(min,nilai,n));
                System.out.println("");
                System.out.println("Petugas : " + nama);
                
            System.out.println("-----------------------------");
            System.out.println("Developed bye : Fahma Maulana");    
           }
        }
    
    
    

