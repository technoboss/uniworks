import java.util.Scanner;

public class LexiStrCompare {
  public static void main(String[] args) {

    Scanner strScan = new Scanner(System.in);
    System.out.println("Enter your 3 different string: ");
    String s1 = strScan.next();
    String s2 = strScan.next();
    String s3 = strScan.next();

    String[] array = new String[] { s1, s2, s3 };

    // elementCompare(array);
    // elemCompare(s1, s2, s3);
    lexCompare(s1, s2, s3);

    strScan.close();

  }

  public static void elemCompare(String s1, String s2, String s3) {
    // String res = "";
    int val1 = s1.compareTo(s2);
    int val2 = s1.compareTo(s3);
    int val3 = s2.compareTo(s3);

    int[] lexiVal = new int[] { val1, val2, val3 };
  }

  public static void lexCompare(String s1, String s2, String s3) {

  }
  public static String elementCompare(String[] array) {
    String res = "";
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i].compareTo(array[j]) > 0) {
          // System.out.println(array[i]);
          res = array[i];
        } else {
          System.out.println(array[j]);
          res = array[j];
        }
      }
    }
    return res;
  }
}
