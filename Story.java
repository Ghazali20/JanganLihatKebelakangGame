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

public class Story {
    private Scene startScene;
    private Character player;
    private Scanner scanner;

    public Story(Scene startScene, Character player) {
        this.startScene = startScene;
        this.player = player;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        play();
    }

    public void play() {
        Scene currentScene = startScene;
        while (currentScene != null && !currentScene.isEnd()) {
            currentScene.display();
            System.out.print("Pilihanmu: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("INFO")) {
                System.out.println(player.getInfo());
                continue;
            }
            Scene next = currentScene.makeChoice(input, player);
            if (next == null) {
                System.out.println("Pilihan tidak valid. Coba lagi.");
            } else {
                currentScene = next;
            }
        }

        if (currentScene != null) currentScene.display();
        System.out.println("\nPermainan selesai.");
    }
}

