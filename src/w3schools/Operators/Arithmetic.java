package w3schools.Operators;

public class Arithmetic {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;

        System.out.println(x + y); // 13
        System.out.println(x - y); // 7
        System.out.println(x * y); // 30
        System.out.println(x / y); // 3
        System.out.println(x % y); // 1

        int z = 5;
        ++z;
        System.out.println(z); // 6
        --z;
        System.out.println(z); // 5



        int peopleInRoom = 0;

// 3 people enter
        peopleInRoom++;
        peopleInRoom++;
        peopleInRoom++;

        System.out.println(peopleInRoom); // 3

// 1 person leaves
        peopleInRoom--;

        System.out.println(peopleInRoom); // 2


    }
}
