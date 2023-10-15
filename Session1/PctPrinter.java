public class PctPrinter {
    public static void main(String[] args){
        double rate = 8.70;
        //int percentage = (int) (100 * rate);
        double percentage = (100 * rate);

        System.out.println(Math.round(percentage));
    }
    
}
