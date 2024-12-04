/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LatihanPertemuan6No1;

/**
 *
 * @author Dhaff
 */
public class Perulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // a. Menghitung Deret Bilangan Prima dan Bukan dari 0-20
        System.out.println("a. Deret Bilangan Prima dan Bukan (0-20)");
        for (int i = 0; i <= 20; i++) { // Perulangan FOR
            boolean isPrima = true;
            if (i < 2) {
                isPrima = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrima = false;
                        break;
                    }
                }
            }
            if (isPrima) {
                System.out.println(i + " adalah bilangan prima");
            } else {
                System.out.println(i + " bukan bilangan prima");
            }
        }
        System.out.println();

        // b. Menghitung Deret Bilangan Ganjil dan Genap dari 0-20
        System.out.println("b. Deret Bilangan Ganjil dan Genap (0-20)");
        int i = 0;
        while (i <= 20) { // Perulangan WHILE
            if (i % 2 == 0) {
                System.out.println(i + " adalah bilangan genap");
            } else {
                System.out.println(i + " adalah bilangan ganjil");
            }
            i++;
        }
        System.out.println();

        // c. Menampilkan Huruf Z - A
        System.out.println("c. Deret Huruf Z - A");
        char letter = 'Z';
        do { // Perulangan DO-WHILE
            System.out.print(letter + " ");
            letter--;
        } while (letter >= 'A');
        System.out.println("\n");

        // d. Lagu "Anak Ayam Turun N"
        System.out.println("d. Lagu \"Anak Ayam Turun N\"");
        int N = 10; // Ubah nilai N sesuai kebutuhan
        for (int n = N; n > 0; n--) { // Perulangan FOR
            if (n == 1) {
                System.out.println("Anak ayam turun " + n + ", mati satu tinggal induknya.");
            } else {
                System.out.println("Anak ayam turun " + n + ", mati satu tinggal " + (n - 1) + ".");
            }
        }
    }
}
