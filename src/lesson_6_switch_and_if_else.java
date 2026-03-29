public class lesson_6_switch_and_if_else {
    public static void main(String[] args) {
// ------ TASK 1 ------
        int month = 4;
//      зима - 12, 1, 2
//      весна - 3, 4, 5
//      літо - 6, 7, 8
//      осінь - 9, 10, 11
        if (month == 12 || month == 1 || month == 2) {
            System.out.println("Winter");
        } else if (month >= 3 && month <= 5) {
            System.out.println("Spring");
        } else if (month == 6 || month == 7 || month == 8) {
            System.out.println("Summer");
        } else if (month == 9 || month == 10 || month == 11) {
            System.out.println("Autumn");
        } else {
            System.out.println("Не є місяцем");
        }
    }
}

