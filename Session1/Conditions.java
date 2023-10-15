import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a value for x: ");
        int x = scan.nextInt();
        System.out.println("Please enter a value for y: ");
        int y = scan.nextInt();

        conditionLogic(x, y);
        scan.close();
    }
    public static void conditionLogic(int x, int y) {
        if (x > 0) {
            System.out.println("hey dude x is positive number !");
        }
        if (x <= 0) {
            System.out.println(" Hey dude x is negative or equal to 0");
        }
        if (x >= 10) {
            System.out.println("Hey dude x above 10 or equal to 10");
        }
        if (x < 10 && x > 0) {
            System.out.println("Hey dude x is less than 10 but greater than 0 ");
        }
        if (x == 0 && y == 0) {
            System.out.println("Hey dude x and y are both equal to 0");
        }
        if (x % 2 == 0) {
            System.out.println("Hey dude x is an even number");
        }
    }
    
}
