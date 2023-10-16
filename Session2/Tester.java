package Session2;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        int num = 2315778;
        //String input = "I love my Liberty, May the Creator bless Us";
        //System.out.printf("%.3f", compound(1.08, 5, 25000));
        //System.out.println(charCounter(input));

        System.out.println(addAllDigits(num));

        

    }
    // Conditional statement to compute compound interest
    public static double compound(double rate, int years, int deposit){
        return rate > 0 || deposit > 0 ? deposit * Math.pow(rate, years) : 0; 
    }
    // convert number to array list
    public static ArrayList<Integer> numArrayConvert(int num){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        do {
            arr.add(num % 10);
            num /= 10;
        } while (num > 0);
        System.out.println(arr);
        return arr;
    }
    // Count characters on a string
    public static int charCounter(String input){
        //int result = input.length();
        var result = (input.length() > 0) ? input.length() : 0;
        return result; 
    }
    // Sum up all the digits in the number
    public static int addAllDigits(int number) {
        int result = 0;
        int tmp = 0;
        while (number > 0) {
            tmp = number % 10;
            result += tmp;
            number /= 10;
        }
        return result;
    }

}
