/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LatihanPertemuan6No2;

/**
 *
 * @author Dhaff
 */
import java.util.Scanner;

public class TabelPerkalian {

    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        // Meminta input n dari pengguna
        System.out.print("Masukkan nilai n (1 - 10): ");
        int n = scanner.nextInt();

        // Validasi input
        if (n < 1 || n > 10) {
            System.out.println("Nilai n harus antara 1 dan 10.");
            return;
        }

        // Membuat header kolom
        System.out.print("\t");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();

        // Membuat tabel perkalian
        for (int i = 1; i <= n; i++) {
            System.out.print(i + "\t"); // Header baris
            for (int j = 1; j <= n; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println(); // Baris baru
        }

        scanner.close();
    }
}

