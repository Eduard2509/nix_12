package ua.com.alevel.FirstLevel.AreaOfTriangle;

import java.io.BufferedReader;
import java.io.IOException;

public class AreaOfTriangle {

    public static void area(BufferedReader reader) throws IOException {
        System.out.println("Please enter x and y coordinate your point");
        System.out.println("Enter coordinate x to point A");
        try {
            int Ax = Integer.parseInt(reader.readLine());
            System.out.println("Enter coordinate y to point A");
            int Ay = Integer.parseInt(reader.readLine());
            System.out.println("Enter coordinate x to point B");
            int Bx = Integer.parseInt(reader.readLine());
            System.out.println("Enter coordinate y to point B ");
            int By = Integer.parseInt(reader.readLine());
            System.out.println("Enter coordinate x to point C");
            int Cx = Integer.parseInt(reader.readLine());
            System.out.println("Enter coordinate y to point C");
            int Cy = Integer.parseInt(reader.readLine());

            double areaTriangle = Math.abs(((Bx - Ax) * (Cy - Ay) - (Cx - Ax) * (By - Ay)) / 2);
            System.out.println("Area triangle = " + areaTriangle);
        }
        catch (NumberFormatException e){
            area(reader);
        }

    }
}
