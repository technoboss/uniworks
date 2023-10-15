package Session2;

public class AreaOfRectangle{
    public static void main(String[] args) throws Exception{
        double length = 3.4;
        double width = 8.4;

        System.out.println("Length: " + length + " - Width: " + width + " - Area: "+ areaCompute(length, width));
    }
    /**
    * Computes the area of a rectangle.
    *
    * @param x a double operand to be multiple by 
    * @param y another double operand
    * @return the product of x and y
    */
    public static double areaCompute (double x , double y){
        return x * y;
    }
}
