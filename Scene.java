/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package janganlihatkebalakang;

/**
 *
 * @author muhammadghazali
 */

import java.util.LinkedHashMap;

public class Scene {
    private String description;
    private LinkedHashMap<String, Choice> choices;

    public Scene(String description) {
        this.description = description;
        this.choices = new LinkedHashMap<>();
    }

    public void setChoices(String choice1, Scene next1, int hp1, int xp1,
                           String choice2, Scene next2, int hp2, int xp2,
                           String choice3, Scene next3, int hp3, int xp3) {
        choices.put("1", new Choice(choice1, next1, hp1, xp1));
        choices.put("2", new Choice(choice2, next2, hp2, xp2));
        choices.put("3", new Choice(choice3, next3, hp3, xp3));
    }

    public void display() {
        System.out.println("\n" + description);
        int i = 1;
        for (Choice c : choices.values()) {
            System.out.println(i + ". " + c.text);
            i++;
        }
        System.out.println("Ketik 'INFO' untuk melihat status karakter.");
    }

    public Scene makeChoice(String input, Character player) {
        if (choices.containsKey(input)) {
            Choice c = choices.get(input);
            player.updateStats(-c.hpChange, c.xpChange);
            if (c.text.toLowerCase().contains("ambil senter")) {
                player.setHasFlashlight(true);
            }
            return c.nextScene;
        }
        return null;
    }

    public boolean isEnd() {
        return choices.isEmpty();
    }

    private static class Choice {
        String text;
        Scene nextScene;
        int hpChange;
        int xpChange;

        Choice(String text, Scene nextScene, int hpChange, int xpChange) {
            this.text = text;
            this.nextScene = nextScene;
            this.hpChange = hpChange;
            this.xpChange = xpChange;
        }
    }
}

