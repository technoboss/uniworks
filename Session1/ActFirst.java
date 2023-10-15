import java.util.Scanner;

public class ActFirst {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an interger between 1 and 20: ");
        int x = scan.nextInt();

        String colour = "Red";
        if (x < 10){
            colour = "blue";
        }
        System.out.println("x colour is " + colour);

        scan.close();
    }
    
}
