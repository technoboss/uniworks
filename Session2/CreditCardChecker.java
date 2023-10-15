package Session2;

public class CreditCardChecker {
    public static void main(String[] args) {
        boolean even = false;
        System.out.println(decode(1, even));
        System.out.println(decode(2, even));
        System.out.println(decode(3, even));
        System.out.println(decode(4, even));
        System.out.println(decode(5, even));
        System.out.println(decode(6, even));
        System.out.println(decode(7, even));
        System.out.println(decode(8, even));
        System.out.println(decode(9, even));
        even = !even;
        System.out.println(decode(1, even));
        System.out.println(decode(2, even));
        System.out.println(decode(3, even));
        System.out.println(decode(4, even));
        System.out.println(decode(5, even));
        System.out.println(decode(6, even));
        System.out.println(decode(7, even));
        System.out.println(decode(8, even));
        System.out.println(decode(9, even));
    
    }
    /**
    * Decode single digit.
    *
    * @param digit an integer 
    * @param position determine if the last digit is odd or even
    * @return an integer number 
    */
    public static int decode(int digit, boolean position) {
        // Your code goes here
        if (position == false) {
            int res = digitSum(digit * 2);
            return res;
        } else {
            return digit;
        }
        
    }
    /**
        * Computes the sum of the digits in a 2 digits integer.
        *
        * @param num represent an integer  
        * @return the sum of the integer digits
        */
    public static int digitSum(int num) {
        final int MODDIV = 10;
        return num == 0 ? 0 : num % MODDIV + digitSum(num / MODDIV);
    }

}
