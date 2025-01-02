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
class SmallMonster extends Monster implements Movable {
    private List<String> weaknesses;

    public SmallMonster(String name, String species) {
        super(name, species);
        this.weaknesses = new ArrayList<>();
    }

    public void addWeakness(String weakness) {
        this.weaknesses.add(weakness);
    }

    public List<String> getWeaknesses() {
        return weaknesses;
    }

    @Override
    public void displayData() {
        System.out.println("Small Monster: " + name);
        System.out.println("Species: " + species);
        System.out.println("Weaknesses: " + String.join(", ", weaknesses));
    }

    @Override
    public void fly() {
        System.out.println(name + " is flying.");
    }

    @Override
    public void walk() {
        System.out.println(name + " is walking.");
    }

    @Override
    public void swim() {
        System.out.println(name + " is swimming.");
    }
}