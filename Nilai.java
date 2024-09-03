/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Nilai {
    // Atribut untuk menyimpan nilai-nilai
    private String nim;
    private String nama;
    private double nilaiAbsen;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;
    private double nilaiAkhir;

    // Konstruktor
    public Nilai(String nim, String nama, double nilaiAbsen, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiAbsen = nilaiAbsen * 0.10; // 10% dari nilai absen
        this.nilaiTugas = nilaiTugas * 0.20; // 20% dari nilai tugas
        this.nilaiUTS = nilaiUTS * 0.30; // 30% dari nilai UTS
        this.nilaiUAS = nilaiUAS * 0.40; // 40% dari nilai UAS
        this.nilaiAkhir = this.nilaiAbsen + this.nilaiTugas + this.nilaiUTS + this.nilaiUAS;
    }

    // Metode untuk mencetak nilai
    public void CetakNilai() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Nilai Absen [10%]: " + nilaiAbsen);
        System.out.println("Nilai Tugas [20%]: " + nilaiTugas);
        System.out.println("Nilai UTS [30%]: " + nilaiUTS);
        System.out.println("Nilai UAS [40%]: " + nilaiUAS);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    }
}
