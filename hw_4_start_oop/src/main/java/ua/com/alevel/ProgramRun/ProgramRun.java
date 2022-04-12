package ua.com.alevel.ProgramRun;

import ua.com.alevel.entity.User;
import ua.com.alevel.service.UserService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramRun {

    private static final UserService userService = new UserService();

    public static void start() {
        System.out.println("Welcome to homework 4 by Eduard Miroshnichenko");
        System.out.println();

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

    private static void caseLogic(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        switch (line) {
            case "1" -> create(reader);
            case "2" -> update(reader);
            case "3" -> delete(reader);
            case "4" -> findById(reader);
            case "5" -> findAll();
            case "0" -> System.exit(0);
        }
    }

    private static void navigation() {
        System.out.println("If you want create user, please enter 1");
        System.out.println("If you want update user, please enter 2");
        System.out.println("If you want delete user, please enter 3");
        System.out.println("If you want find user, please enter 4");
        System.out.println("If you want find all user, please enter 5");
        System.out.println("If you want exit, please enter 0");
    }

    private static void create(BufferedReader reader) throws IOException {
        System.out.println("Please, enter your name: ");
        String name = reader.readLine();
        System.out.println("Please, enter your age: ");
        int age = 0;
        try {
            age = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.out.println("Please, try again");
            create(reader);
        }
        User user = new User();
        user.setName(name);
        user.setAge(age);
        userService.create(user);
        System.out.println("User is created!");
    }

    private static void update(BufferedReader reader) throws IOException {
        System.out.println("Please, enter id: ");
        String id = reader.readLine();
        System.out.println("please, enter your name: ");
        String name = reader.readLine();
        System.out.println("please, enter your age: ");
        int age = 0;
        try {
            age = Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.out.println("Please, try again, enter 1");
            System.out.println("If you want exit program, enter 0");
            String number = reader.readLine();
            switch (number) {
                case "1" -> update(reader);
                case "0" -> System.exit(0);
            }
        }
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setAge(age);
        userService.update(user);
        System.out.println("User updated!");
    }

    private static void delete(BufferedReader reader) throws IOException {
        System.out.println("Please, enter id to delete user: ");
        try {
            String id = reader.readLine();
            UserService userService = new UserService();
            userService.delete(id);
        }
        catch (NullPointerException e) {
            System.out.println("Please, try again, enter 1");
            System.out.println("If you want exit program, enter 0");
            String number = reader.readLine();
            switch (number) {
                case "1" -> delete(reader);
                case "0" -> System.exit(0);
            }
        }
    }

    private static void findById(BufferedReader reader) throws IOException {
        System.out.println("Please enter id users, for find user: ");
        try {
            String id = reader.readLine();
            UserService userService = new UserService();
            userService.findById(id);
        }
        catch (NullPointerException e) {
            System.out.println("Please, try again, enter 1");
            System.out.println("If you want exit program, enter 0");
            String number = reader.readLine();
            switch (number) {
                case "1" -> findById(reader);
                case "0" -> System.exit(0);
            }
        }
    }

    private static void findAll() {
        for (User user : userService.findAll()) {
            if (user != null) {
                System.out.println("User " + user);
            } else {
                System.out.println("");
            }
        }
    }
}
