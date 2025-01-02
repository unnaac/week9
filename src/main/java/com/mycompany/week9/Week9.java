/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week9;

/**
 *
 * @author Niym
 */
import java.io.*;
import java.util.*;

public class Week9{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MonsterList monsterList = new MonsterList();
        String filename = "monsters.dat";

        try {
            monsterList = MonsterList.loadFromFile(filename);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Tidak ada data ditemukan, membuat baru");
        }

        while (true) {
            System.out.println("\nMonster Hunter App");
            System.out.println("1. Add Small Monster");
            System.out.println("2. Add Large Monster");
            System.out.println("3. Display All Monsters");
            System.out.println("4. Save and Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Masukan Nama: ");
                    String smName = scanner.nextLine();
                    System.out.print("Enter species: ");
                    String smSpecies = scanner.nextLine();
                    SmallMonster sm = new SmallMonster(smName, smSpecies);

                    System.out.print("Enter weaknesses (comma-separated): ");
                    String[] smWeaknesses = scanner.nextLine().split(",");
                    for (String weakness : smWeaknesses) {
                        sm.addWeakness(weakness.trim());
                    }

                    monsterList.addSmallMonster(sm);
                }
                case 2 -> {
                    System.out.print("Masukan Nama: ");
                    String lmName = scanner.nextLine();
                    System.out.print("Enter species: ");
                    String lmSpecies = scanner.nextLine();
                    LargeMonster lm = new LargeMonster(lmName, lmSpecies);

                    System.out.print("Enter elements (comma-separated): ");
                    String[] lmElements = scanner.nextLine().split(",");
                    for (String element : lmElements) {
                        lm.addElement(element.trim());
                    }

                    System.out.print("Enter ailments (comma-separated): ");
                    String[] lmAilments = scanner.nextLine().split(",");
                    for (String ailment : lmAilments) {
                        lm.addAilment(ailment.trim());
                    }

                    System.out.print("Enter weaknesses (comma-separated): ");
                    String[] lmWeaknesses = scanner.nextLine().split(",");
                    for (String weakness : lmWeaknesses) {
                        lm.addWeakness(weakness.trim());
                    }

                    System.out.print("Enter resistances (comma-separated): ");
                    String[] lmResistances = scanner.nextLine().split(",");
                    for (String resistance : lmResistances) {
                        lm.addResistance(resistance.trim());
                    }

                    monsterList.addLargeMonster(lm);
                }
                case 3 -> monsterList.displayAllMonsters();
                case 4 -> {
                    try {
                        monsterList.saveToFile(filename);
                        System.out.println("Data disimpan dan keluar ...");
                        return;
                    } catch (IOException e) {
                        System.out.println("Gagal menyimpan data!!");
                    }
                }
                default -> System.out.println("Tidak ada pilihan itu, coba pilihan yang tersedia yak");
            }
        }
    }
}
