import java.util.Scanner;


public class NumberInsanity {


    public NumberInsanity() { }


    public void go() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = myScanner.nextInt();
        String msg = result(num); // call helper method and store result
        System.out.println(msg);
    }


    // helper method that returns string containing message to be printed
    private String result(int num) {
        if (num == 0) {
            return "That's not positive! (not negative either)";
        } else if (num < 0) {
            return "That's isn't positive!";
        } else if (num % 2 != 0) {
            if (num % 5 == 0 && num % 7 == 0) {
                return "Divisible by 5 and 7!";
            } else if (num % 5 == 0) {
                return "Divisible by 5!";
            } else if (num % 7 == 0) {
                return "Divisible by 7!";
            } else {
                return "Not divisible by 5 or 7!";
            }
        } else {
            if (num >= 100) {
                return "Big even number!";
            } else if (num >= 50) {
                return "Medium even number!";
            } else {
                return "Small even number!";
            }
        }
    }
}
