package ua.com.alevel;


import ua.com.alevel.FirstLevel.AreaOfTriangle.AreaOfTriangle;
import ua.com.alevel.FirstLevel.ChessKnight.ChessKnight;
import ua.com.alevel.FirstLevel.UniqueSymbol.UniqueSymbol;
import ua.com.alevel.SecondLevel.TestOnValidString.TestOnValidString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to module 1 by Eduard Miroshnichenko");
        System.out.println();
        System.out.println("Please click enter");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine();
            while (true) {
                System.out.println();
                navigation();
                caseLogic(reader);
            }
        } catch (IOException e) {
            System.out.println("error: " + e);
        }
    }

    private static void navigation() {
        System.out.println("Please enter 1 if you want go to First Level");
        System.out.println("Please enter 2 if you want go to Second Level");
        System.out.println("If you want exit the program enter 0");
    }

    public static void navigationToExercise() {
        System.out.println("If you want go to first exercise enter 1");
        System.out.println("If you want go to second exercise enter 2");
        System.out.println("If you want go to third exercise enter 3");
        System.out.println("If you want exit the program enter 0");
    }
    private static void changeNavigation() {
        System.out.println("If you want go to first task second level, please enter 1");
        System.out.println("If you want back to menu, please enter 2");
        System.out.println("If you want exit the program enter 0");
    }

    private static void caseLogic(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        switch (line) {
            case "1" -> {
                navigationToExercise();
                String lineExercise = reader.readLine();
                switch (lineExercise) {
                    case "1" -> UniqueSymbol.outPutSetting(reader);
                    case "2" -> ChessKnight.move(reader);
                    case "3" -> AreaOfTriangle.area(reader);
                    case "0" -> System.exit(0);
                }

            }
            case "2" -> {
                changeNavigation();
                String change = reader.readLine();
                switch (change) {
                    case "1" -> TestOnValidString.start(reader);
                    case "2" -> navigation();
                    default -> System.exit(0);
                }
            }
            case "0" -> System.exit(0);
        }

    }
}
