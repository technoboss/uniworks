public class AvgCalculator {
    public static void main(String[] args) {
        int age1 = 18;
        int age2 = 25;
        int age3 = 50;
        int age4 = 44;

        double averageAge = ((age1 + age2 + age3 + age4) / 4);
        // Type cast the result to int
        System.out.println((int) averageAge);
    }
    
}
