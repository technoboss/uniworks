import java.util.ArrayList;
import java.util.List;

public class HelloSP2 {
    public static void main(String[] args) {
        //Array
        String[] countdoun = {"Five", "Four", "Three", "Two", "One"}; 
        //ArrayList
        List<String> myName = new ArrayList<String>();
        myName.add("Don");
        myName.add("Maleek");
        myName.add("Curtis");
        // Print Array
        for (int i = countdoun.length - 1; i >= 0; i--){
            System.out.println(countdoun[i] + ": H E L L O  Software Programming II");
        }
        // Print ArrayList
        // for (String Obj : myName){
        //     System.out.print(Obj + " ");
        // }
        myName.add("MR.");
        // for (int i = 0; i < myName.size(); i++){
        //     System.out.println(myName.get(i));
        // }
        int i = 0;
        while (myName.size() > i) {
            System.out.println(myName.get(i));
            i++;
        }
    }
}