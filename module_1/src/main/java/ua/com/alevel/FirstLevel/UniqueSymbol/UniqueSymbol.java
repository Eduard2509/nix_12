package ua.com.alevel.FirstLevel.UniqueSymbol;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class UniqueSymbol {


    public static int uniqueSymbol(int[] inSize) {
        Set<Integer> uniqueSymbol = new TreeSet<>();
        for (int number : inSize) {
            uniqueSymbol.add(number);
        }
        return uniqueSymbol.size();
    }

    public static void outPutSetting(BufferedReader reader) throws IOException {
        System.out.println("Enter size array: ");
        try {
            int size = Integer.parseInt(reader.readLine());
            int[] arr = new int[size];
            System.out.println("Enter your number: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(reader.readLine());
            }
            System.out.println("Number of unique characters " + uniqueSymbol(arr));
        }
         catch(NumberFormatException e) {
                System.out.println("Please try enter number again");
                outPutSetting(reader);
            }



    }
}

