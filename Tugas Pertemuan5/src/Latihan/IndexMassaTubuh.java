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

public class IndexMassaTubuh {

    public static void main(String[] args) {
        // Input berat badan dan tinggi badan
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Berat Badan (kg): ");
            double beratBadan = input.nextDouble();
            System.out.print("Tinggi Badan (m): ");
            double tinggiBadan = input.nextDouble();
            
            // Menghitung IMT
            double imt = beratBadan / (tinggiBadan * tinggiBadan);
            
            // Menentukan kategori IMT
            String kategori;
            if (imt < 18.4) {
                kategori = "Berat Badan Kurang";
            } else if (imt >= 18.5 && imt <= 24.9) {
                kategori = "Berat Badan Ideal";
            } else if (imt >= 25 && imt <= 29.9) {
                kategori = "Berat Badan Lebih";
            } else if (imt >= 30 && imt <= 39.9) {
                kategori = "Gemuk";
            } else {
                kategori = "Sangat Gemuk";
            }
            
            // Output
            System.out.println("IMT: " + imt);
            System.out.println("Kategori: " + kategori);
        }
    }
    
}
