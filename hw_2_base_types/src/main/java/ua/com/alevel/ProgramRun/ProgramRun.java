package ua.com.alevel.ProgramRun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramRun {


    public static void start() {

        System.out.println("Welcome to homework 2 by Eduard Miroshnichenko");
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

    private static void caseLogic(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        switch (line) {
            case "1" -> sortAndSumNumber(reader);
            case "2" -> sortLetters(reader);
            case "3" -> ClassInSchool(reader);
            case "0" -> System.exit(0);
        }
    }

    private static void navigation() {
        System.out.println("If you want overview first exercise, please enter 1");
        System.out.println("If you want overview second exercise, please enter 2");
        System.out.println("If you want overview third exercise, please enter 3");
        System.out.println("If you want exit, please enter 0");
    }

    private static void sortAndSumNumber(BufferedReader reader) throws IOException {

        System.out.println("ProgramRun.exercise1 start");
        System.out.println("Please enter your message include letters and number");
        int sum = 0;
        String message = reader.readLine();
        String[] chars = message.split("");
        for (int i = 0; i < chars.length; i++) {
            try {
                sum += Integer.parseInt(chars[i]);
            } catch (NumberFormatException e) {

            }

        }
        System.out.println("Sum number in your message: " + sum);
    }

    private static void sortLetters(BufferedReader reader) throws IOException {

        int[] lettersOut = new int[(int) Character.MAX_VALUE];
        System.out.println("Exercise 2 start!");
        System.out.println("Please enter your message include one word");

        try {
            String lettersIn = reader.readLine();
            char[] messages = lettersIn.toCharArray();
            for (int i = 0; i < messages.length; i++) {
                if (messages[i] >= 'a' && messages[i] <= 'z' || messages[i] >= 'A' && messages[i] <= 'Z') {
                    lettersOut[messages[i]]++;
                }
            }
        } catch (IOException e) {
            System.out.println("Exeption: " + e);
        }
        int k = 0;
        for (int i = 'a'; i <= 'z'; i++) {
            if (lettersOut[i] != 0) {
                k++;
                System.out.println(k + ". " + (char) i + " = " + lettersOut[i]);
            }
        }

        for (int i = 'A'; i <= 'Z'; i++) {
            if (lettersOut[i] != 0) {
                k++;
                System.out.println(k + ". " + (char) i + " = " + lettersOut[i]);
            }
        }
    }

    private static String ClassInSchool(BufferedReader reader) throws IOException {

        System.out.println("Please enter number class 1 to 10");
        int numberClass = Integer.parseInt(reader.readLine());
        if (numberClass > 0 && numberClass <= 10) {
            String[] endClass = new String[]{"9:45", "10:35", "11:35", "12:25", "13:25", "14:15", "15:15", "16:05", "17:05", "17:55"};
            System.out.println("Class " + numberClass + " ends at " + endClass[numberClass - 1]);
        } else {
            ClassInSchool(reader);
        }

        return null;
    }

}