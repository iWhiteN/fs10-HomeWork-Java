package com.danit.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class TodoList {
    private String[][] scedule = new String[7][2];
    private String userInput = "";

    {
        scedule[0][0] = "Sunday";
        scedule[0][1] = "do home work";
        scedule[1][0] = "Monday";
        scedule[1][1] = "go to courses; watch a film";
        scedule[2][0] = "Tuesday";
        scedule[2][1] = "do smth 1";
        scedule[3][0] = "Wednesday";
        scedule[3][1] = "do smth 2";
        scedule[4][0] = "Thursday";
        scedule[4][1] = "do smth 3";
        scedule[5][0] = "Friday";
        scedule[5][1] = "do smth 4";
        scedule[6][0] = "Saturday";
        scedule[6][1] = "do smth 5";
    }

    public void start() {
        System.out.println(Arrays.deepToString(scedule));

        Scanner scan = new Scanner(System.in);

        while (!userInput.toLowerCase().trim().equals("exit")) {
            System.out.print("Please, input the day of the week: ");
            userInput = scan.nextLine();
            boolean valid = false;

            for (String[] elem : scedule) {
                if (elem[0] != null && elem[0].toLowerCase().equals(userInput.trim().toLowerCase())) {
                    System.out.println(elem[1]);
                    valid = true;
                }
            }
            if (!valid && !userInput.trim().toLowerCase().equals("exit"))
                System.out.println("Sorry, I don't understand you, please try again.");
        }
    }
}
