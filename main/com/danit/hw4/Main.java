package com.danit.hw4;

public class Main {
    public static void main(String[] args) {

        Pet pet22 = new Pet();
        Human mother22 = new Human();
        Human father22 = new Human();
        Human child22 = new Human();

        System.out.println(pet22);
        System.out.println(mother22);
        System.out.println(father22);
        System.out.println(child22);

        /*===========================================================================================================*/
        System.out.println("=================================================================================================");

        Pet pet11 = new Pet("dog", "bobbi");
        Human mother11 = new Human("Juli", "Fisher", 43);
        Human father11 = new Human("Jami", "Fisher", 41);
        Human child11 = new Human("Jessica", "Fisher", 12, mother11, father11);

        System.out.println(pet11);
        System.out.println(mother11);
        System.out.println(father11);
        System.out.println(child11);

        /*===========================================================================================================*/
        System.out.println("=================================================================================================");

        Pet pet33 = new Pet("dog", "bobbi", 5, 56, new String[]{"fast", "hungry"});
        Human mother33 = new Human("Juli", "Fisher", 43);
        Human father33 = new Human("Jami", "Fisher", 41);

        String[][] child1Schedule = new String[7][7];
        child1Schedule[0][0] = "Sunday";
        child1Schedule[0][1] = "do home work";
        child1Schedule[1][0] = "Monday";
        child1Schedule[1][1] = "go to courses; watch a film";
        child1Schedule[2][0] = "Tuesday";
        child1Schedule[2][1] = "do smth 1";
        child1Schedule[3][0] = "Wednesday";
        child1Schedule[3][1] = "do smth 2";
        child1Schedule[4][0] = "Thursday";
        child1Schedule[4][1] = "do smth 3";
        child1Schedule[5][0] = "Friday";
        child1Schedule[5][1] = "do smth 4";
        child1Schedule[6][0] = "Saturday";
        child1Schedule[6][1] = "do smth 5";

        Human child33 = new Human("Jessica", "Fisher", 12, 80, pet33, mother33, father33, child1Schedule);

        System.out.println(pet33);
        System.out.println(mother33);
        System.out.println(father33);
        System.out.println(child33);

        System.out.println("=================================================================================================");

        child33.describePet();
        child33.greetPet();
        System.out.println(child33);
        child33.getPet().eat();
        child33.getPet().respond();
        child33.getPet().foul();
        System.out.println(child33.getPet());

    }
}
