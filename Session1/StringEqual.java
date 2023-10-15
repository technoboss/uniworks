public class StringEqual {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "abcdefg";
        String str3 = str1 + "efg";
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        if (str2.equals(str3))
        System.out.println("The strings are equal");
        else
        System.out.println("The strings are not equal");
        }
        /*With Strings, the == operator is used to comparing the reference of 
        the given strings, depending on if they are referring to the same
        objects. When you compare two strings using == operator, it will return 
        true if the string variables are pointing toward the same java object. 
        Otherwise, it will return false . */
    
}
