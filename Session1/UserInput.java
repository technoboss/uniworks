import java.util.Scanner;

public class UserInput { 
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = scan.nextInt();

        System.out.println("Enter number b: ");
        int b = scan.nextInt();

        System.out.println("The smallest number is: " + smallest(a, b)); 
       
        scan.close();

    }
    public static int smallest(int a, int b) {
        return  Math.min(a, b);
    }

}
