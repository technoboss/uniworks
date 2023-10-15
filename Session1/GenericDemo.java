public class GenericDemo {
    public static void main(String[] args){
        // Creating new object of PrinterGenDemo class
        PrinterGenDemo<Integer> printInt = new PrinterGenDemo<>(225);
        PrinterGenDemo<String> printStr = new PrinterGenDemo<>("Hello Abidjan");
        // Call a method from another class
        printInt.print();
        printStr.print();

        // Calling generic method
        todo("RIPOPOPO", "Abidjan", 2023);
        
    }
    // Generic method that accept multiple type
    private static <T, V, E> void todo (T thingsToDo, V whereToDo, E whenTodo){
        System.out.println(thingsToDo);
        System.out.println(whereToDo);
        System.out.println(whenTodo + " Hooooray!!!");
    }
    
}

