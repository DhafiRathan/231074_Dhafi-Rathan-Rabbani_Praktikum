/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Latihan;

/**
 *
 * @author User
 */

import java.util.Scanner;


public class PotonganPembelian {

    public static void main(String[] args) {
        // Input total pembelian
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Total pembelian (Rp): ");
            double totalPembelian = input.nextDouble();
            
            // Menghitung diskon
            double potongan;
            if (totalPembelian < 50000) {
                potongan = 0.05 * totalPembelian;
            } else {
                potongan = 0.2 * totalPembelian;
            }
            
            // Menghitung total yang harus dibayar
            double totalBayar = totalPembelian - potongan;
            
            // Output
            System.out.println("Total pembelian: Rp " + totalPembelian);
            System.out.println("Besar potongan: Rp " + potongan);
            System.out.println("Jumlah yang harus dibayar: Rp " + totalBayar);
        }
    }    
}
