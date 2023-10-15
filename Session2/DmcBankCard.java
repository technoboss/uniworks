package Session2;

public class DmcBankCard {
    public static void main(String[] args) {
        
        //System.out.println(decode(2856358, oddOrEven(2856358)));
        int res = digitAddup(2856358);
        int res1 = digitAddup(res);
        System.out.println(digitAddup(res1));
       
        }
        /**
        * Computes the checks to detect invalid card number.
        *
        * @param digit an integer representing the card number 
        * @param position determine if the last digit is odd or even
        * @return an integer number between 1 an 7
        */
        public static int decode(int digit, boolean position) {
        // Your code goes here
            int lastDigit = lastDigit(digit);

            if (position == false) {
                int res = digitAddup(lastDigit * 2);
                return res;
            } else {
                return lastDigit;
            }
        }
        // Function that compute the number of digits
        public static int digitPosition(int number) {
            int count = 0 ;
            while (number != 0) {
                number /= 10;
                count++;   
            }
            return count;
        }
        // Function that Determine the rightmost digit position 
        public static boolean oddOrEven(int position) {
            boolean even;
            position = digitPosition(position);

            if (position % 2 == 0){
                even = true;
            } else {
                even = false;
            }
            return even;
        }
        // Function that return the far rightmost digit
        public static int lastDigit(int digit) {
            final int MODULUSBY = 10;
            int lastDigit = digit % MODULUSBY;
            return lastDigit; 
        }
        // Function that add up the digit of a number of at least 2 digits 
        public static int digitAddup(int num) {
            final int DIVIDER = 10;
            int addUp = 0;

            while (num > 0) {
                addUp = addUp + num % DIVIDER;
                num = num / DIVIDER;
            }
            return addUp;
        }
   
}
