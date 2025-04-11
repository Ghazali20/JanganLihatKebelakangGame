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
        Scene endGood = new Scene("GOOD ENDING: Kamu menutup mata saat cermin pecah. Ketika membukanya kembali, ruangan kosong… dan kamu merasa beban itu telah hilang. Kamu bebas.");
        Scene endBad = new Scene("BAD ENDING: Kamu melihat ke belakang atau menatap pecahan cermin. Suara jeritan menelanmu dalam kegelapan. Kamu tak pernah ditemukan.");
        Scene endNeutral = new Scene("NEUTRAL ENDING: Kamu berhasil keluar. Tapi setiap kali melihat cermin, kamu merasa... dia masih di sana.");

         // Story scenes
        Scene scene1 = new Scene("Kamu memasuki sebuah rumah lalu menemukan sebuah cermin tua antik serta kamu melihat sebuah ruangan yang kosong gelap.");
        Scene sceneItem = new Scene("Kamu masuk ke sebuah ruangan gelap dan melihat senter di lantai. Di ruangan itu ternyata tidak ada apa-apa dan kamu memutuskan untuk kembali ke kaca antik itu karena merasa penasaran .");
        Scene scene2 = new Scene("kamu kembali ke cermin antik itu dan melihat cerminnya mulai berembun.");
        Scene scene3 = new Scene("Lampu mulai berkedip-kedip.");
        Scene scene4 = new Scene("Tiba- tiba ada bayangan muncul di balik cermin.");
        Scene scene5 = new Scene("Cermin itu tiba-tiba mulai retak.");
        Scene scene6 = new Scene("Kamu mendengar suara seseorang berbisik 'lihat aku...' (iiiii seremnyaaa).");
        Scene scene7 = new Scene("Kamu mendengar suara tangisan dari balik cermin. (hatii-hatii yaaa)");
        Scene scene8 = new Scene("Cermin tiba-tiba menghitam.");
        Scene scene9 = new Scene("Sebuah tangan keluar dari cermin. (semangat yaa)");
        Scene scene10 = new Scene("Cermin pecah berkeping-keping. Suara jeritan memekakkan telinga.");

        // Set choices & connections
        scene1.setChoices("Tatap cermin", scene2, 0, 5,
                          "Masuk ke ruangan gelap", sceneItem, 0, 5,
                          "Sentuh permukaan cermin", scene2, 0, 10);

        sceneItem.setChoices("Ambil senter", scene2, 0, 5,
                             "Abaikan dan kembali", scene2, 0, 0,
                             "Teriak minta tolong", scene2, 5, 0);

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

        scene9.setChoices("Lari", endBad, 100, 0,
                          "Pukul tangan itu", scene10, 10, 10,
                          "Tutup mata", scene10, 0, 10);

        scene10.setChoices("Hancurkan cermin", endGood, 0, 20,
                           "Menoleh ke belakang", endBad, 100, 0,
                           "Diam terpaku", endNeutral, 0, 5);

        Story story = new Story(scene1, player);
        story.start();
        
        
    }
}
