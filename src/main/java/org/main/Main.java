package org.main;
import org.main.fan.CeilingFan;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CeilingFan ceilingFan = new CeilingFan();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        String input;
        int command;
        System.out.print("""
                    =====MENU=====
                [1] -> to pull speed cord.
                [2] -> to reverse direction.
                [3] -> to see current direction.
                [4] -> to see current speed.
                """);
        do {
            input = scanner.nextLine();
            if(input.equalsIgnoreCase("exit")){
                exit = true;
            } else {
                try {
                    command = Integer.parseInt(input);
                    switch (command) {
                        case 1 ->
                                ceilingFan.pullSpeedCord();
                        case 2 ->
                                ceilingFan.pullReverseCord();
                        case 3 ->
                                System.out.println("Fan direction is currently set to: " + ceilingFan.getDirection());
                        case 4 ->
                                System.out.println("Fan speed is currently at: " + ceilingFan.getSpeed());
                        default ->
                                System.out.println("Invalid entry");
                    }
                } catch (NumberFormatException e){
                    System.out.println("Invalid Input");
                }
            }
        } while (!exit);
        System.out.println("Goodbye");
        scanner.close();
    }
}