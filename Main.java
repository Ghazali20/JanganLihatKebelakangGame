/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package janganlihatkebalakang;

/**
 *
 * @author muhammadghazali
 */


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama karakter: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan umur karakter: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // buang newline

        Character player = new Character(name, age);

        // Ending scenes
        Scene endGood = new Scene("GOOD ENDING: Kamu berhasil menghancurkan cermin dan semuanya menghilang.");
        Scene endBad = new Scene("BAD ENDING: Kamu menoleh ke belakang... dan semuanya menghilang.");
        Scene endNeutral = new Scene("NEUTRAL ENDING: Kamu berhasil kabur, tapi masih merasa dia mengawasimu.");

        // Story scenes
        Scene scene1 = new Scene(" Kamu berdiri di depan sebuah cermin tua yang misterius, dalam suasana rumah lama yang kosong dan mencekam.");
        Scene scene2 = new Scene("Cermin mulai berembun, padahal ruangan ini dingin. Kabut perlahan membentuk pola aneh.");
        Scene scene3 = new Scene("Lampu gantung mulai berkedip. Sekilas kamu melihat bayangan bergerak di refleksi cermin..");
        Scene scene4 = new Scene("Di balik cermin, terlihat siluet seseorang... atau sesuatu. Ia tak bergerak, hanya menatap balik.");
        Scene scene5 = new Scene("Cermin mulai retak di bagian tengah. Sebuah suara lirih berkata, ‘Tolong aku....");
        Scene scene6 = new Scene("Terdengar bisikan dari cermin: ‘Lihat aku… hanya sekali saja…’.");
        Scene scene7 = new Scene("Tangisan terdengar dari dalam cermin. Suara perempuan… mungkin anak kecil.");
        Scene scene8 = new Scene("Cermin menjadi hitam legam, seperti kolam tak berdasar. Refleksimu tak terlihat.");
        Scene scene9 = new Scene("Tiba-tiba, sebuah tangan pucat merobek permukaan cermin dari dalam. Menjalar ke arahmu.");
        Scene scene10 = new Scene("Cermin meledak menjadi ribuan keping. Suara jeritan perempuan menggema di seluruh rumah.");

        // Set choices
        scene1.setChoices("Tatap cermin", scene2, 0, 5,
                          "Panggil nama sendiri", scene3, 5, 5,
                          "Sentuh permukaan", scene2, 0, 10);

        scene2.setChoices("Usap cermin", scene3, 0, 5,
                          "Gambar simbol", scene4, 5, 5,
                          "Biarkan saja", scene3, 0, 0);

        scene3.setChoices("Periksa lampu", scene4, 5, 5,
                          "Abaikan", scene4, 0, 5,
                          "Matikan lampu", scene5, 0, 10);

        scene4.setChoices("Dekati", scene5, 5, 5,
                          "Teriak", scene6, 10, 5,
                          "Ambil foto", scene6, 0, 10);

        scene5.setChoices("Pukul cermin", scene6, 10, 5,
                          "Diam", scene7, 0, 10,
                          "Lari", endNeutral, 0, 5);

        scene6.setChoices("Lihat", endBad, 100, 0,
                          "Tutup mata", scene7, 0, 10,
                          "Balik badan", endNeutral, 5, 5);

        scene7.setChoices("Panggil namanya", scene8, 0, 5,
                          "Diam saja", scene8, 0, 0,
                          "Menangis juga", scene9, 5, 5);

        scene8.setChoices("Sentuh cermin", scene9, 10, 10,
                          "Ambil batu", scene9, 5, 5,
                          "Berdoa", scene10, 0, 10);

        scene9.setChoices("Tarik tangan itu", scene10, 20, 10,
                          "Lari", endNeutral, 0, 5,
                          "Diam di tempat", endBad, 100, 0);

        scene10.setChoices("Menutup mata", endGood, 0, 15,
                           "Menatap pecahan", endBad, 100, 5,
                           "Mundur perlahan", endNeutral, 10, 10);

        Story story = new Story(scene1, player);
        story.start();
    }
}
