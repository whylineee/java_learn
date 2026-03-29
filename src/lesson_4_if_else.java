public class lesson_4_if_else {
    public static void main(String[] args) {
        int value = 10;
//        boolean test = value > 0;
        if (value > 0) {
            System.out.println('+');
        } else if (value < 0) {
            System.out.println('-');
        } else {
            System.out.println(0);
        }
    }
}
