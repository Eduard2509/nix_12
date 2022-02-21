package ua.com.alevel.SecondLevel.TestOnValidString;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Stack;

public class TestOnValidString {
    //This example: https://www.cyberforum.ru/java-j2se/thread1221665.html

        private static boolean isInArray(char symbol, char[] array) {
            if (array == null)
                throw new IllegalArgumentException();
            for (int i = 0; i < array.length; i++) {
                if (array[i] == symbol)
                    return true;
            }
            return false;
        }

        private static int indexOf(char symbol, char[] array) {
            if (array == null)
                throw new IllegalArgumentException();

            int index = -1;
            for (int i = 0; i < array.length; i++) {
                if (array[i] == symbol)
                    index = i;
            }
            return index;
        }

        public static boolean brackets(String text) {
            if (text == null)
                throw new IllegalArgumentException();

            Stack<Character> stack = new Stack<Character>();

            char[] openBrackets = new char[]{'{', '[', '('};
            char[] closeBrackets = new char[]{'}', ']', ')'};

            for (int i = 0; i < text.length(); i++) {
                char symbol = text.charAt(i);
                if (isInArray(symbol, openBrackets))
                    stack.push(symbol);
                else {
                    int index = indexOf(symbol, closeBrackets);
                    if (index != -1) {
                        if (stack.empty())
                            return false;
                        if (stack.pop() != openBrackets[index])
                            return false;
                    }
                }
            }
            return stack.empty();
        }

    public static void start(BufferedReader reader) throws IOException {
        System.out.println("Please enter string for analise on validate");
        String text = reader.readLine();
        if (brackets(text)) {
            System.out.println("This string is valid");
        } else {
            System.out.println("This string is invalid");
        }
    }
    }
