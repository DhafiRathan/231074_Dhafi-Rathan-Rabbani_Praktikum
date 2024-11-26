/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihanpertemuan3no2;

/**
 *
 * @author User
 * Kelas utama untuk mendemonstrasikan konversi suhu
 */

public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek dari kelas KonversiSuhu dan KonversiSuhu2
        KonversiSuhu konversi1 = new KonversiSuhu();
        KonversiSuhu2 konversi2 = new KonversiSuhu2();

        // Input suhu dalam celcius
        double celcius = 25;
        
        // Memanggil metode untuk koversi celcius ke Fahrenheit dan Reamur 
        
        double fahrenheit = konversi1.celciusToFahrenheit(celcius);    // 25 C -> 77 F
        double reamur = konversi1.celciusToReamur(celcius);            // 25 C -> 20 R
        
        // Menampilkan hasil konversi
        
        System.out.println("Celcius ke Fahrenheit: " + fahrenheit);
        System.out.println("Celcius ke Reamur: " + reamur);
        
        // Memanggil metode untuk konversi Fahrenheit ke Reamur menggunakan kelas turunan
        
        double reamurDariFahrenheit = konversi2.fahrenheitToReamur(fahrenheit);
        System.out.println("Fahrenheit ke Reamur: " + reamurDariFahrenheit);
     


        
        
        
    }
    
}
