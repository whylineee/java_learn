package w3schools.Strings;

public class strings_java {
    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("C"));

        String txt1 = "Hello";
        System.out.println(txt1.charAt(0));  // H
        System.out.println(txt1.charAt(4));  // o

        // String txt1 = "Hello";
        String txt2 = "Hello";

        String txt3 = "Greetings";
        String txt4 = "Great things";

        System.out.println(txt1.equals(txt2));  // true
        System.out.println(txt3.equals(txt4));  // false

        String txt12 = "       Hello  World          ";
        System.out.println("Before: [" + txt12 + "]");
        System.out.println("After:  [" + txt12.trim() + "]");

    }
}