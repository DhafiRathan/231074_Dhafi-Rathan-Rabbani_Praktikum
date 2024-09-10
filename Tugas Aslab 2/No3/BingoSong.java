/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanpertemuan2.No3;

/**
 *
 * @author User
 */
public class BingoSong {
    private String[] lyrics = {
        "B-I-N-G-O",
        "B-I-N-G-O",
        "B-I-N-G-O",
        "And Bingo was his name-o."
    };

    // Konstruktor
    public BingoSong() {
        // Inisialisasi jika diperlukan
    }

    // Metode untuk mencetak semua lirik
    public void printLyrics() {
        for (int i = 0; i <= 5; i++) {
            printVerse(i);
        }
    }

    // Metode untuk mencetak setiap bait dengan jumlah tepukan yang sesuai
    private void printVerse(int clapCount) {
        System.out.println("There was a farmer who had a dog,");
        System.out.println("And Bingo was his name-o.");

        // Ganti huruf pertama sebanyak clapCount dengan "(clap)"
        String clappedLyrics = lyrics[0];
        for (int i = 0; i < clapCount; i++) {
            clappedLyrics = clappedLyrics.replaceFirst("[A-Z]", "(clap)");
        }

        // Cetak tiga kali lirik dengan tepukan yang sudah diganti
        System.out.println(clappedLyrics);
        System.out.println(clappedLyrics);
        System.out.println(clappedLyrics);

        System.out.println("And Bingo was his name-o.\n");
    }
}
