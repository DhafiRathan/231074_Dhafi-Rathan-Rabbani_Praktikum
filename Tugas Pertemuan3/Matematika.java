/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanpertemuan3no1;

/**
 *
 * @author User
 */
public class Matematika {
    public int pertambah (int a, int b){
        return a + b; 
    }
    
    public int pengurang (int a, int b) {
        return a - b;
    }
    
    public int perkalian (int a, int b) {
        return a * b;
    }
    
    public int pembagian (int a, int b) {
        if (b != 0) {
            return a / b; //Operasi pembagian (jika b bukan nol)
        } else {
            throw new ArithmeticException ("Pembagian  dengan nol tidak diperbolehkan.");
        }
    }
    
}