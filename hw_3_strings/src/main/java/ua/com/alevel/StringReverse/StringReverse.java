package ua.com.alevel.StringReverse;

public class StringReverse {

    public static String reverse(String onString) {
        String string = "";
        for (int i = onString.length() - 1; i >= 0; i--) {
            string += onString.charAt(i);
        }
        return onString.replaceAll(onString, string);
    }

    public static String reverse(String onString, String part) {
        String string = "";
        for (int i = part.length() - 1; i >= 0; i--){
            string += part.charAt(i);
        }
        return onString.replaceAll(part, string);
    }

    public static String reverse(String onString, int firstIndex, int lastIndex) {
        String string = "";
        String part = onString.substring(firstIndex, lastIndex);
        for (int i = part.length() - 1; i >= 0; i--) {
            string += part.charAt(i);
        }
        return onString.replaceAll(part, string);
    }

}
