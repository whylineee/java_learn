package w3schools;

public class if_else {
    public static void main(String[] args) {
        boolean isRaining = true;

        if (isRaining) {
            System.out.println("Bring an umbrella!");

        if (20 > 18) {
            System.out.println("20 greater then 18");
        }

       // int x = 20;
       // int y = 20;
      //  if (x == y) {
       //     System.out.println("das");
     //   }

        //boolean isLightOn = true;

       // if (isLightOn) {
        //    System.out.println("The light is on.");
      //  }

            boolean isLightOn = false;

            if (isLightOn) {
                System.out.println("The light is on.");  // This will not be printed
            }

            System.out.println("This line runs no matter what, because it is outside the if statement.");

            int x = 20;
            int y = 18;

            if (x > y)
                System.out.println("x is greater than y ");
                System.out.println("This line runs no matter what ");

        }
    }
}
