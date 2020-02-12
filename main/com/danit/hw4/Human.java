package com.danit.hw4;

import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private String[][] schedule = new String[7][7];

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human() {
    }

    public void greetPet() {
        System.out.println("Привет, " + pet.getNickname());
    }

    public void describePet() {
        System.out.println("У меня есть " + pet.getSpecies() + ", ему " + pet.getAge() + " лет, он " + Arrays.toString(new String[]{pet.getTrickLevel() > 50 ? "очень хитрый" : "почти не хитрый"}));
    }

    public String getName() {
        return name == null ? "" : name;
    }

    public String getSurname() {
        return surname == null ? "" : surname;
    }

    public int getYear() {
        return year;
    }

    public int getIq() {
        return iq;
    }

    public Pet getPet() {
        return pet;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    @Override
    public String toString() {
        return "Human{name=" + name + ", surname=" + surname + ", year=" + year + ", iq=" + iq +
                ", mother=" + (mother == null ? "" : mother.getName()) + " " + (mother == null ? "" : mother.getSurname()) +
                ", father=" + (father == null ? "" : father.getName()) + " " + (father == null ? "" : father.getSurname()) +
                ", pet=" + (pet == null ? "" : pet.getSpecies()) + "{nickname=" + (pet == null ? "" : pet.getNickname()) +
                ", age=" + (pet == null ? "" : pet.getAge()) + ", trickLevel=" + (pet == null ? "" : pet.getTrickLevel()) +
                ", habits=" + (pet == null ? "[]" : Arrays.toString(pet.getHabits())) + "}}";
    }
}
