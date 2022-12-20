package com.samsung;

public class Monstr {
    String name;
    int health;
    int armor;

    Monstr(String name, int health, int armor) {
        this.name = name;
        this.health = health;
        this.armor = armor;
    }

    public Monstr(Monstr monstr) {
        this.name = monstr.name;
        this.health = monstr.health;
        this.armor = monstr.armor;
    }

    public String toString() {
        return "Name: " + name + "\n" +
                "Health: " + health + "\n" +
                "Armor: " + armor;
    }
}
