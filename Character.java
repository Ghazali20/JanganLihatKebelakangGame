/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package janganlihatkebalakang;

/**
 *
 * @author muhammadghazali
 */

public class Character {
    private String name;
    private int age;
    private int health;
    private int xp;
    private boolean hasFlashlight;

    public Character(String name, int age) {
        this.name = name;
        this.age = age;
        this.health = 100;
        this.xp = 0;
        this.hasFlashlight = false;
    }

    public void updateStats(int healthChange, int xpChange) {
        health += healthChange;
        xp += xpChange;
        if (health > 100) health = 100;
        if (health < 0) health = 0;
    }
    
    public void setHasFlashlight(boolean hasFlashlight) {
        this.hasFlashlight = hasFlashlight;
    }

    public boolean hasFlashlight() {
        return hasFlashlight;
    }

    public String getInfo() {
        return "Nama: " + name + " | Umur: " + age + " | Health: " + health + " | XP: " + xp +
               (hasFlashlight ? " | Item: Senter" : " | Item: Tidak ada");
    }
}
