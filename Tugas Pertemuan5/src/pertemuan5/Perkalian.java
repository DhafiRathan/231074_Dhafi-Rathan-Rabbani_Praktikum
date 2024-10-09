/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Perkalian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukan = new Scanner (System.in);
        System.out.print("Masukkan angka pertama: ");
        int angka1 = masukan.nextInt();
        
        System.out.print("Masukkan  angka kedua: ");
        int angka2 = masukan.nextInt();
        
        System.out.print("Hasil perkalian: " + (angka1 * angka2));
    }
    
}
