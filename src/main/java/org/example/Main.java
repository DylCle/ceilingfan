package org.example;

import org.fan.CeilingFan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CeilingFan ceilingFan = new CeilingFan();
        Scanner scanner = new Scanner(System.in);
        String exit;
        int input;

        System.out.print("""
                    =====MENU=====
                [1] -> to pull speed cord.
                [2] -> to reverse direction.
                [3] -> to see current direction.
                [4] -> to see current speed.
                """);
        do {
            input = scanner.nextInt();
            switch (input) {
                case 1 ->
                    ceilingFan.pullSpeedCord();
                case 2 ->
                    ceilingFan.pullReverseCord();
                case 3 ->
                    System.out.println("Fan direction is currently: " + ceilingFan.getDirection());
                case 4 ->
                    System.out.println("Fan speed is currently at: " + ceilingFan.getSpeed());
                default ->
                    System.out.println("Invalid entry");
            }
            exit = scanner.nextLine();
        } while (!exit.equals("exit"));
        System.out.println("Goodbye");

    }
}