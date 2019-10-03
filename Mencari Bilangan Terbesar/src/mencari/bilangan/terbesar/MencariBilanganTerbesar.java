/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mencari.bilangan.terbesar;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MencariBilanganTerbesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Mencari Bilangan Terbesar Dari 2 Data atau Lebih
        Scanner Baca = new Scanner (System.in);
        int B1,B2,B3,B4,B;
        System.out.print("Masukan Bilangan Pertama = ");B1=Baca.nextInt();
        System.out.print("Masukan Bilangan Kedua = ");B2=Baca.nextInt();
        System.out.print("Masukan Bilangan Ketiga = ");B3=Baca.nextInt();
        System.out.print("Masukan Bilangan Keempat = ");B4=Baca.nextInt();
        
        B=B1;
        
        System.out.print("Bilangan Terbesarnya Adalah = ");
        if (B<B2) B=B2;
        if (B<B3) B=B3;
        if (B<B4) B=B4;
        
        System.out.println(B);
    }
    
}
