package ua.com.alevel;

import ua.com.alevel.StringReverse.StringReverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to third homework \"Strings\" by Eduard Miroshnichenko");
        menu();

    }
    private static void menu(){
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println();
                navigation();
                caseLogic(reader);
            }
        } catch (IOException e) {
            System.out.println("error: " + e);
        }
    }

    private static void caseLogic(BufferedReader reader) throws IOException{
        String change = reader.readLine();
        switch (change) {
            case "1" -> {
                System.out.println("Please enter your string");
                String onSting = reader.readLine();
                System.out.println(StringReverse.reverse(onSting));
            }
            case "2" -> {
                System.out.println("Please enter your string");
                String onString = reader.readLine();
                System.out.println("Please enter part reverse");
                String part = reader.readLine();
                System.out.println(StringReverse.reverse(onString, part));
            }
            case "3" -> {
                System.out.println("Please enter your string");
                String onString = reader.readLine();
                System.out.println("Please enter first index reverse");

                int firstIndex = 0;
                try {
                    firstIndex = Integer.parseInt(reader.readLine());
                    System.out.println("Please enter last index reverse");
                } catch(NumberFormatException e) {
                    System.out.println("Please try again");
                    menu();
                }
                int lastIndex = 0;
                try {
                    lastIndex = Integer.parseInt(reader.readLine());
                    System.out.println("Please enter last index reverse");
                } catch(NumberFormatException e) {
                    System.out.println("Please try again");
                    menu();
                }

                System.out.println(StringReverse.reverse(onString, firstIndex, lastIndex));
            }
            case "0" -> System.exit(0);
        }
    }

    private static void navigation() {
        System.out.println("If you want reverse all string, please enter 1");
        System.out.println("If you want reverse all string, please enter 2");
        System.out.println("If you want reverse all string, please enter 3");
        System.out.println("If you want exit, please enter 0");
    }
}
