package Abstracts;

import java.sql.SQLOutput;

public class Dogy_style extends Animals{
    int age;
    String name, species;

    public Dogy_style(int age, String name, String species) {
        this.age = age;
        this.name = name;
        this.species = species;
    }

    public void getInfo() {
        System.out.println(getName() + name + " " + getSpecies() + species);
    }
}
