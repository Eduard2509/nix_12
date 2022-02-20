package ua.com.alevel.FirstLevel.ChessKnight;

import java.io.BufferedReader;
import java.io.IOException;

public class ChessKnight {

    static int coordinateY = 0;
    static int coordX = 0;
    static char knight = 1;
    public static void move(BufferedReader reader) throws IOException {
        int m = 8;
        int n = 8;

        int [][] chessBoarding = new int[m][n];

        for(int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
                if ((i + j) % 2 == 0)
                    System.out.print(" 0 ");
                else
                    System.out.print(" # ");
            System.out.println();
        }
        System.out.println(" " + "A  " + "B  " + "C  " + "D  " + "E  " + "F  " + "G  " + "H");

        System.out.println("Enter the current position of the knight on the board 8x8 ");
        System.out.println("If you want exit the program enter 0");
        System.out.println("Please, enter start coordinate knight A - H (X coordinate): ");
        String coordinateX = reader.readLine();
        switch (coordinateX) {
            case "A", "a" -> coordX = 1;
            case "B", "b" -> coordX = 2;
            case "C", "c" -> coordX = 3;
            case "D", "d" -> coordX = 4;
            case "E", "e" -> coordX = 5;
            case "F", "f" -> coordX = 6;
            case "G", "g" -> coordX = 7;
            case "H", "h" -> coordX = 8;
            case "0" -> System.exit(0);
            default -> {
                System.out.println("Please, try again!");
                move(reader);
            }
        }
        System.out.println("Please, enter start coordinate knight 1 - 8 (Y coordinate): ");

        try {
            coordinateY = Integer.parseInt(reader.readLine());
            if (coordinateY > 0 && coordinateY <= 8) {
                afterMove(reader);
            } else {
                System.out.println("Please, try again!");
                move(reader);
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Please, try again!");
            move(reader);
        }
    }

        public static void afterMove(BufferedReader reader) throws IOException {
        System.out.println("Please, enter coordinate A - H  where would you like the chess horse to go ");
        String moveToX = reader.readLine();
        int moveX = 0;
        switch (moveToX) {
            case "A", "a" -> moveX = 1;
            case "B", "b" -> moveX = 2;
            case "C", "c" -> moveX = 3;
            case "D", "d" -> moveX = 4;
            case "E", "e" -> moveX = 5;
            case "F", "f" -> moveX = 6;
            case "G", "g" -> moveX = 7;
            case "H", "h" -> moveX = 8;
            case "0" -> System.exit(0);
            default -> {
                System.out.println("Please, try again!");
                move(reader);
            }
        }
        System.out.println("Please, enter coordinate 1 - 8  where would you like the chess horse to go ");
        int moveToY = 0;
        try {
            moveToY = Integer.parseInt(reader.readLine());
            if (moveToY > 0 && moveToY <= 8) {
                moveToY = moveToY;
            } else {
                System.out.println("Please, try again!");
                move(reader);
            }
        } catch (NumberFormatException e) {
            System.out.println("Please, try again!");
            move(reader);
        }
        if (coordX > 2 && coordX <= 6 && coordinateY > 2 && coordinateY <= 6) {
            if (moveX == coordX + 2 && moveToY == coordinateY - 1 ||
                    moveX == coordX + 2 && moveToY == coordinateY + 1 ||
                    moveX == coordX - 2 && moveToY == coordinateY - 1 ||
                    moveX == coordX - 2 && moveToY == coordinateY + 1 ||
                    moveX == coordX - 1 && moveToY == coordinateY - 2 ||
                    moveX == coordX + 1 && moveToY == coordinateY - 2 ||
                    moveX == coordX - 1 && moveToY == coordinateY + 2 ||
                    moveX == coordX + 1 && moveToY == coordinateY + 2) {
                System.out.println("Position knight now:" + moveToX + moveToY);
            } else {
                System.out.println("This move is not possible");
                move(reader);
            }
        } else if (coordX == 1 && coordinateY == 1) {
            if (moveX == coordX + 1 && moveToY == coordinateY + 2 ||
                    moveX == coordX + 2 && moveToY == coordinateY + 1) {
                System.out.println("Position knight now:" + moveToX + moveToY);
            } else {
                System.out.println("This move is not possible");
                move(reader);
            }

        } else if (coordX == 1 && coordinateY == 8) {
            if (moveX == coordX + 1 && moveToY == coordinateY - 2 ||
                    moveX == coordX + 2 && moveToY == coordinateY - 1) {
                System.out.println("Position knight now:" + moveToX + moveToY);
            } else {
                System.out.println("This move is not possible");
                move(reader);
            }

        } else if (coordX == 8 && coordinateY == 1) {
            if (moveX == coordX - 1 && moveToY == coordinateY + 2 ||
                    moveX == coordX - 2 && moveToY == coordinateY + 1) {
                System.out.println("Position knight now:" + moveToX + moveToY);
            } else {
                System.out.println("This move is not possible");
                move(reader);
            }

        } else if (coordX == 8 && coordinateY == 8) {
            if (moveX == coordX - 2 && moveToY == coordinateY - 1 ||
                    moveX == coordX - 1 && moveToY == coordinateY - 2) {
                System.out.println("Position knight now:" + moveToX + moveToY);
            } else {
                System.out.println("This move is not possible");
                move(reader);
            }

        } else if (coordX == 2 && coordinateY == 1) {
            if (moveX == coordX + 1 && moveToY == coordinateY + 2 ||
                    moveX == coordX - 1 && moveToY == coordinateY + 2 ||
                    moveX == coordX + 2 && moveToY == coordinateY + 1) {
                System.out.println("Position knight now:" + moveToX + moveToY);
            } else {
                System.out.println("This move is not possible");
                move(reader);
            }

        } else if (coordX == 2 && coordinateY == 8) {
            if (moveX == coordX + 2 && moveToY == coordinateY - 1 ||
                    moveX == coordX - 1 && moveToY == coordinateY - 2 ||
                    moveX == coordX + 1 && moveToY == coordinateY - 2) {
                System.out.println("Position knight now:" + moveToX + moveToY);
            } else {
                System.out.println("This move is not possible");
                move(reader);
            }

        } else if (coordX == 7 && coordinateY == 1) {
            if (moveX == coordX - 2 && moveToY == coordinateY + 1 ||
                    moveX == coordX - 1 && moveToY == coordinateY + 2 ||
                    moveX == coordX + 1 && moveToY == coordinateY + 2) {
                System.out.println("Position knight now:" + moveToX + moveToY);
            } else {
                System.out.println("This move is not possible");
                move(reader);
            }

        } else if (coordX == 7 && coordinateY == 8) {
            if (moveX == coordX - 2 && moveToY == coordinateY - 1 ||
                    moveX == coordX - 1 && moveToY == coordinateY - 2 ||
                    moveX == coordX + 1 && moveToY == coordinateY - 2) {
                System.out.println("Position knight now:" + moveToX + moveToY);
            } else {
                System.out.println("This move is not possible");
                move(reader);
            }

        } else if (coordX >= 3 && coordX <= 6 && coordinateY == 1) {
            if (moveX == coordX - 2 && moveToY == coordinateY + 1 ||
                    moveX == coordX + 2 && moveToY == coordinateY + 1 ||
                    moveX == coordX - 1 && moveToY == coordinateY + 2 ||
                    moveX == coordX + 1 && moveToY == coordinateY + 2) {
                System.out.println("Position knight now:" + moveToX + moveToY);
            } else {
                System.out.println("This move is not possible");
                move(reader);
            }

        } else if (coordX >= 3 && coordX <= 6 && coordinateY == 8) {
            if (moveX == coordX - 2 && moveToY == coordinateY - 1 ||
                    moveX == coordX + 2 && moveToY == coordinateY - 1 ||
                    moveX == coordX - 1 && moveToY == coordinateY - 2 ||
                    moveX == coordX + 1 && moveToY == coordinateY - 2) {
                System.out.println("Position knight now:" + moveToX + moveToY);
            } else {
                System.out.println("This move is not possible");
                move(reader);
            }
        } else if (coordX == 1 && coordinateY == 2) {
            if (moveX == coordX + 1 && moveToY == coordinateY + 2 ||
                    moveX == coordX + 2 && moveToY == coordinateY - 1 ||
                    moveX == coordX + 2 && moveToY == coordinateY + 1) {
                System.out.println("Position knight now:" + moveToX + moveToY);
            } else {
                System.out.println("This move is not possible");
                move(reader);
            }

        } else if (coordX == 8 && coordinateY == 2) {
            if (moveX == coordX - 1 && moveToY == coordinateY + 2 ||
                    moveX == coordX - 2 && moveToY == coordinateY - 1 ||
                    moveX == coordX - 2 && moveToY == coordinateY + 1) {
                System.out.println("Position knight now:" + moveToX + moveToY);
            } else {
                System.out.println("This move is not possible");
                move(reader);
            }
        } else if (coordX == 1 && coordinateY == 7) {
            if (moveX == coordX + 2 && moveToY == coordinateY + 1 ||
                    moveX == coordX + 2 && moveToY == coordinateY - 1 ||
                    moveX == coordX + 1 && moveToY == coordinateY - 2) {
                System.out.println("Position knight now:" + moveToX + moveToY);
            } else {
                System.out.println("This move is not possible");
                move(reader);
            }
        } else if (coordX == 8 && coordinateY == 7) {
            if (moveX == coordX - 2 && moveToY == coordinateY - 1 ||
                    moveX == coordX - 2 && moveToY == coordinateY + 1 ||
                    moveX == coordX - 1 && moveToY == coordinateY - 2) {
                System.out.println("Position knight now:" + moveToX + moveToY);
            } else {
                System.out.println("This move is not possible");
                move(reader);
            }
        } else if (coordX == 2 && coordinateY == 7) {
            if (moveX == coordX + 1 && moveToY == coordinateY - 2 ||
                    moveX == coordX - 1 && moveToY == coordinateY - 2 ||
                    moveX == coordX + 2 && moveToY == coordinateY + 1 ||
                    moveX == coordX + 2 && moveToY == coordinateY - 1) {
                System.out.println("Position knight now:" + moveToX + moveToY);
            } else {
                System.out.println("This move is not possible");
                move(reader);
            }
        } else if (coordX == 7 && coordinateY == 7) {
            if (moveX == coordX + 1 && moveToY == coordinateY - 2 ||
                    moveX == coordX - 1 && moveToY == coordinateY - 2 ||
                    moveX == coordX - 2 && moveToY == coordinateY + 1 ||
                    moveX == coordX - 2 && moveToY == coordinateY - 1) {
                System.out.println("Position knight now:" + moveToX + moveToY);
            } else {
                System.out.println("This move is not possible");
                move(reader);
            }
        } else if (coordX == 7 && coordinateY == 2) {
            if (moveX == coordX + 1 && moveToY == coordinateY + 2 ||
                    moveX == coordX - 1 && moveToY == coordinateY + 2 ||
                    moveX == coordX - 2 && moveToY == coordinateY + 1 ||
                    moveX == coordX - 2 && moveToY == coordinateY - 1) {
                System.out.println("Position knight now:" + moveToX + moveToY);
            } else {
                System.out.println("This move is not possible");
                move(reader);
            }
        } else if (coordX == 1 && coordinateY >= 3 && coordinateY <= 6) {
            if (moveX == coordX + 2 && moveToY == coordinateY - 1 ||
                    moveX == coordX + 2 && moveToY == coordinateY + 1 ||
                    moveX == coordX + 1 && moveToY == coordinateY + 2 ||
                    moveX == coordX + 1 && moveToY == coordinateY - 2) {
                System.out.println("Position knight now:" + moveToX + moveToY);
            } else {
                System.out.println("This move is not possible");
                move(reader);
            }
        } else if (coordX == 8 && coordinateY >= 3 && coordinateY <= 6) {
            if (moveX == coordX - 2 && moveToY == coordinateY + 1 ||
                    moveX == coordX - 2 && moveToY == coordinateY - 1 ||
                    moveX == coordX - 1 && moveToY == coordinateY + 2 ||
                    moveX == coordX - 1 && moveToY == coordinateY - 2) {
                System.out.println("Position knight now:" + moveToX + moveToY);
            } else {
                System.out.println("This move is not possible");
                move(reader);
            }
        } else if (coordX == 2 && coordinateY >= 3 && coordinateY <= 6) {
            if (moveX == coordX + 2 && moveToY == coordinateY + 1 ||
                    moveX == coordX + 2 && moveToY == coordinateY - 1 ||
                    moveX == coordX - 1 && moveToY == coordinateY + 2 ||
                    moveX == coordX + 1 && moveToY == coordinateY + 2 ||
                    moveX == coordX - 1 && moveToY == coordinateY - 2 ||
                    moveX == coordX + 1 && moveToY == coordinateY - 2) {
                System.out.println("Position knight now:" + moveToX + moveToY);
            } else {
                System.out.println("This move is not possible");
                move(reader);
            }
        } else if (coordX == 7 && coordinateY >= 3 && coordinateY <= 6) {
            if (moveX == coordX - 2 && moveToY == coordinateY + 1 ||
                    moveX == coordX - 2 && moveToY == coordinateY - 1 ||
                    moveX == coordX - 1 && moveToY == coordinateY + 2 ||
                    moveX == coordX + 1 && moveToY == coordinateY + 2 ||
                    moveX == coordX - 1 && moveToY == coordinateY - 2 ||
                    moveX == coordX + 1 && moveToY == coordinateY - 2) {
                System.out.println("Position knight now:" + moveToX + moveToY);
            } else {
                System.out.println("This move is not possible");
                move(reader);
            }
        } else if (coordX >= 3 && coordX <= 6 && coordinateY == 2) {
            if (moveX == coordX - 2 && moveToY == coordinateY + 1 ||
                    moveX == coordX - 2 && moveToY == coordinateY - 1 ||
                    moveX == coordX + 2 && moveToY == coordinateY + 1 ||
                    moveX == coordX + 2 && moveToY == coordinateY - 1 ||
                    moveX == coordX - 1 && moveToY == coordinateY + 2 ||
                    moveX == coordX + 1 && moveToY == coordinateY + 2) {
                System.out.println("Position knight now:" + moveToX + moveToY);
            } else {
                System.out.println("This move is not possible");
                move(reader);
            }
        } else if (coordX >= 3 && coordX <= 6 && coordinateY == 7) {
            if (moveX == coordX - 2 && moveToY == coordinateY + 1 ||
                    moveX == coordX - 2 && moveToY == coordinateY - 1 ||
                    moveX == coordX + 2 && moveToY == coordinateY + 1 ||
                    moveX == coordX + 2 && moveToY == coordinateY - 1 ||
                    moveX == coordX - 1 && moveToY == coordinateY - 2 ||
                    moveX == coordX + 1 && moveToY == coordinateY - 2) {
                System.out.println("Position knight now:" + moveToX + moveToY);
            } else {
                System.out.println("This move is not possible");
                move(reader);
            }
        }
    }
//    public static void navigation(BufferedReader reader) throws IOException {
//        System.out.println("If you want back to menu, please enter 1");
//        System.out.println("If you want exit, please enter 0");
//        ChessKnight.logic(reader);
//    }
//
//    private static void logic(BufferedReader reader) throws IOException {
//        int number = Integer.parseInt(reader.readLine());
//        switch (number) {
//            case 1 -> navigationToExercise();
//            case 0 -> System.exit(0);
//        }
//    }


}
