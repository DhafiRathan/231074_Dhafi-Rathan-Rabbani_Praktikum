/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanpertemuan2.MenerapkanInterface;

/**
 *
 * @author User
 */
public class Matematika implements OperasiMatematika{

    @Override
    public int Pertambahan(int a, int b) {
        return a + b;
    }

    @Override
    public int Pengurangan(int a, int b) {
        return a - b;
    }

    @Override
    public int Perkalian(int a, int b) {
        return a * b ;
    }

    @Override
    public int Pembagian(int a, int b) {
        if (b != 0){
            return a / b;
        } else{
            throw new ArithmeticException("Pembagi tidak boleh nol");
        }
    }
     
    
}
