package ua.com.alevel.ProgramRun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramRun {


    public static void start() {

        System.out.println("Welcome to homework by Eduard Miroshnichenko");
        System.out.println();
        System.out.println("Please enter your");

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

    private static void caseLogic(BufferedReader reader) throws IOException{
        String line = reader.readLine();
        switch (line) {
            case "1" -> exercise1(reader);
            case "2" -> exercise2();
            case "3" -> exercise3();
            case "0" -> System.exit(0);
        }
    }

    private static void navigation() {
        System.out.println("If you want overview first exercise, please enter 1");
        System.out.println("If you want overview second exercise, please enter 2");
        System.out.println("If you want overview third exercise, please enter 3");
        System.out.println("If you want exit, please enter 0");
    }

    private static void exercise1(BufferedReader reader) throws IOException {

        System.out.println("ProgramRun.exercise1 start");
        System.out.println("Please enter your message include letters and number");

            String message = reader.readLine();
            char[] chars = message.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                System.out.println(chars[i]);
            }
}

    private static void exercise2() {
        System.out.println("ProgramRun.exercise2 start");
        System.out.println("Please enter your message include letters and number");


    }

    private static void exercise3() {
        System.out.println("ProgramRun.exercise3 start");
        System.out.println("Please enter your message include letters and number");

    }
}

    
