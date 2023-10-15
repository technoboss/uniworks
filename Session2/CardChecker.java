package Session2;

import java.util.ArrayList;

public class CardChecker {
    public static void main(String[] args) {
        int num = 2315778;
        System.out.println("CC number: " + num + " is " + checkDigits(num));
        System.out.println(securityToken(num));
        num = 1234567;
        System.out.println("CC number: " + num + " is " + checkDigits(num));
        System.out.println(securityToken(num));
        num = 7654321;
        System.out.println("CC number: " + num + " is " + checkDigits(num));
        System.out.println(securityToken(num));
        num = 1111111;
        System.out.println("CC number: " + num + " is " + checkDigits(num));
        System.out.println(securityToken(num));

    }
    /**
    * Compute some checks on card number to identify valid or invalid cards.
    *
    * @param number an integer representing the card number 
    * @return result whether the card is valid or invalid
    */ 
    public static String checkDigits(int number) {
        // Put your code here
        number = securityToken(number);
        String checks = "invalid";
        final int MODULUSBY = 10;
        if (number % MODULUSBY == 0) {
            checks = "valid";
            return checks;
        } else {
            checks = "invalid";
            return checks;
        }
    }
    /**
    * Add up every digit of a number  .
    *
    * @param number an integer representing the card number 
    * @return the sum of all digits of the number processed
    */ 
    public static int securityToken(int number) {
        // calling a function that return an ArrayList 
        ArrayList<Integer> arrlst = DigitArray(number);
        int sum = 0;
        int digit;
        
        // Loop through the ArrayList size to do some processing
        for (int i = 0; i < arrlst.size(); i++){
            if (i % 2 != 0){
                digit = digitSum(arrlst.get(i) * 2);
                sum += digit;
            } else {
                digit = arrlst.get(i);
                sum += digit;
            }
        }
        return sum;
    }
    /**
    * Convert number to integer ArrayList.
    *
    * @param number an integer representing the card number 
    * @return an integer ArrayList 
    */
    public static ArrayList<Integer> DigitArray(int number){
        final int MODDIVBY = 10;
        ArrayList<Integer> arrlst = new ArrayList<>();
        do {
            arrlst.add(number % MODDIVBY);
            number /= MODDIVBY;
        } while (number > 0);
        return arrlst;
    }
    /**
    * Add up 2 digits number  .
    *
    * @param number an integer representing 2 digits number 
    * @return the sum of the digits 
    */ 
    public static int digitSum(int num) {
        final int MODDIV = 10;
        return num == 0 ? 0 : num % MODDIV + digitSum(num / MODDIV);
    }

    // compute the position of the each digit
    // public static boolean oddOrEven(ArrayList<Integer> arrlst) {
    //     int count = 0;
    //     boolean position = false;
    //     for (int i = 0; i < arrlst.size(); i++) {
    //         count++;
    //         if (count % 2 == 0) {
    //             position = true;
    //         } else {
    //             position = false;
    //         }
    //         //System.out.println(position);
    //     }
    //     return position;
    // }

    // Sum up all the digit in the number
    // public static int addAllDigits(int number) {
    //     int result = 0;
    //     int tmp = 0;
    //     while (number > 0) {
    //         tmp = number % 10;
    //         result += tmp;
    //         number /= 10;
    //     }
    //     return result;
    // }

}
