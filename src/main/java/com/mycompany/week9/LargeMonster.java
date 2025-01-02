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
class LargeMonster extends Monster implements Movable {
    private List<String> elements;
    private List<String> ailments;
    private List<String> weaknesses;
    private List<String> resistances;

    public LargeMonster(String name, String species) {
        super(name, species);
        this.elements = new ArrayList<>();
        this.ailments = new ArrayList<>();
        this.weaknesses = new ArrayList<>();
        this.resistances = new ArrayList<>();
    }

    public void addElement(String element) {
        this.elements.add(element);
    }

    public List<String> getElements() {
        return elements;
    }

    public void addAilment(String ailment) {
        this.ailments.add(ailment);
    }

    public List<String> getAilments() {
        return ailments;
    }

    public void addWeakness(String weakness) {
        this.weaknesses.add(weakness);
    }

    public List<String> getWeaknesses() {
        return weaknesses;
    }

    public void addResistance(String resistance) {
        this.resistances.add(resistance);
    }

    public List<String> getResistances() {
        return resistances;
    }

    @Override
    public void displayData() {
        System.out.println("Large Monster: " + name);
        System.out.println("Species: " + species);
        System.out.println("Elements: " + String.join(", ", elements));
        System.out.println("Ailments: " + String.join(", ", ailments));
        System.out.println("Weaknesses: " + String.join(", ", weaknesses));
        System.out.println("Resistances: " + String.join(", ", resistances));
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
