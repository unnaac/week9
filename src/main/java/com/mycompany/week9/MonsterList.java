/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week9;

/**
 *
 * @author Niym
 */
import java.io.*;
import java.util.*;
class MonsterList implements Serializable {
    private List<SmallMonster> smallMonsters;
    private List<LargeMonster> largeMonsters;

    public MonsterList() {
        this.smallMonsters = new ArrayList<>();
        this.largeMonsters = new ArrayList<>();
    }

    public void addSmallMonster(SmallMonster monster) {
        smallMonsters.add(monster);
    }

    public void addLargeMonster(LargeMonster monster) {
        largeMonsters.add(monster);
    }

    public void displaySmallMonsters() {
        for (SmallMonster monster : smallMonsters) {
            monster.displayData();
        }
    }

    public void displayLargeMonsters() {
        for (LargeMonster monster : largeMonsters) {
            monster.displayData();
        }
    }

    public void displayAllMonsters() {
        System.out.println("Small Monsters:");
        displaySmallMonsters();
        System.out.println("\nLarge Monsters:");
        displayLargeMonsters();
    }

    public void saveToFile(String filename) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(this);
        }
    }

    public static MonsterList loadFromFile(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (MonsterList) ois.readObject();
        }
    }
}
