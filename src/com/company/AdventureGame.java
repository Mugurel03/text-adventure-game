package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AdventureGame {
    private int choice;
    private String command; //the game will use string commands for advancing in the game
    List<String> acceptedCommands = Arrays.asList("yes", "no", "help");

    public AdventureGame() {

    }

    public static void gameHelp() {

        System.out.println("""
                The commands are:\s
                yes - accepting some statements
                no - not accepting some statements""");

    }


    public void gameStartup() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""

                                                   _   _            __  __                   _        _      \s
                     /\\                           | | | |          |  \\/  |                 | |      (_)     \s
                    /  \\   ___ _ __ ___  ___ ___  | |_| |__   ___  | \\  / | ___  _   _ _ __ | |_ __ _ _ _ __ \s
                   / /\\ \\ / __| '__/ _ \\/ __/ __| | __| '_ \\ / _ \\ | |\\/| |/ _ \\| | | | '_ \\| __/ _` | | '_ \\\s
                  / ____ \\ (__| | | (_) \\__ \\__ \\ | |_| | | |  __/ | |  | | (_) | |_| | | | | || (_| | | | | |
                 /_/    \\_\\___|_|  \\___/|___/___/  \\__|_| |_|\\___| |_|  |_|\\___/ \\__,_|_| |_|\\__\\__,_|_|_| |_|
                                                                                                             \s
                                                                                                             \s
                """);
        Player player = new Player();
        player.setName("Balthasar");

        System.out.println("Welcome to 'Across the Mountain' " +
                "\nYou're name is " + player.getName() + "" +
                ", a poor boy who wants to travel the dangerous world alone!" +
                "\nDo you want to start? (enter yes or no)");


        do {
            command = scanner.nextLine();

            switch (command) {
                case "help" -> gameHelp();
                case "yes" -> {
                    Map map1 = new Map("The Town Center");
                    map1.townCenter();
                }
                case "no" -> System.out.println("no");
                default -> System.out.println("Command not found, please enter help to see the list of commands!");
            }

        } while (!acceptedCommands.contains(command));


    }


}
