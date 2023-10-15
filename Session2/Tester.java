package Session2;

import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {
        //int num = 2315778;
        String input = "I love my Liberty, May the Creator bless Us";
        //System.out.printf("%.3f", compound(1.08, 5, 25000));
        System.out.println(charCounter(input));
        

    }
    // Conditional statement
    public static double compound(double rate, int years, int deposit){
        return rate > 0 || deposit > 0 ? deposit * Math.pow(rate, years) : 0; 
    }
    public static ArrayList<Integer> numArrayConvert(int num){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        do {
            arr.add(num % 10);
            num /= 10;
        } while (num > 0);
        System.out.println(arr);
        return arr;
    }
    public static int charCounter(String input){
        //int result = input.length();
        var result = (input.length() > 0) ? input.length() : 0;
        return result; 
    }

}
