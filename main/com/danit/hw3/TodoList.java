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
            if (!valid && !userInput.equals("exit"))
                System.out.println("Sorry, I don't understand you, please try again.");
        }
    }
}
