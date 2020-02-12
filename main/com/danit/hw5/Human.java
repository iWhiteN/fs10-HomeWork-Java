package com.danit.hw5;

import java.util.Arrays;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Family family;
    private String[][] schedule = new String[7][7];

    static {
        System.out.println("Загружается новый класс Human");
    }

    {
        System.out.println("Загружается новый экземпляр класса " + this.getClass().getSimpleName());
    }

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human() {
    }


    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
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


    public String[][] getSchedule() {
        return schedule;
    }

    @Override
    public String toString() {
        return "Human{name=" + name + ", surname=" + surname + ", year=" + year + ", iq=" + iq + ", schedule=" + Arrays.deepToString(schedule);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + year;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return name.equals(human.name) && year == human.year;
    }
}
