package com.danit.hw2;

import java.util.Random;
import java.util.Scanner;

public class AreaShooting {
    private String[][] square = new String[6][6];
    private String[][] numberGame = new String[6][6];
    private String line;
    private String column;

    public String[][] fillingArea(String[][] area, String val) {
        for (int i = 1; i < area.length; i++) {
            for (int j = 1; j < area[i].length; j++) {
                area[i][j] = "-";
            }
        }
        return area;
    }

    public void printArea(String[][] area) {
        for (int i = 0; i < area.length; i++) {
            if (i > 0) System.out.print(i + " | ");
            for (int j = 0; j < area[i].length; j++) {
                if (i == 0) System.out.print(j + " | ");
                if (i > 0 && j > 0) System.out.print(area[i][j] + " | ");
            }
            System.out.println();
        }
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        square = fillingArea(square, "-");
        numberGame = fillingArea(numberGame, "-");

        numberGame[random.nextInt(4) + 1][random.nextInt(4) + 1] = "X";
        System.out.println("Top secret");
        printArea(numberGame);

        System.out.println("All set. Get ready to rumble!");

        while (true) {
            System.out.print("Input line (1-5): ");
            line = scan.nextLine();

            if (line.matches("[1-5]")) {
                System.out.print("Input column (1-5): ");
                column = scan.nextLine();

                if (column.matches("[1-5]")) {
                    if (numberGame[Integer.parseInt(line)][Integer.parseInt(column)].equals("X")) {
                        System.out.println("You have won!");
                        square[Integer.parseInt(line)][Integer.parseInt(column)] = "X";
                        printArea(square);
                        break;
                    } else {
                        square[Integer.parseInt(line)][Integer.parseInt(column)] = "*";
                    }
                    printArea(square);
                }
            }

        }
    }
}
