public class PrinterGenDemo <T>{
    
    T printSomething;

    // Constructor
    public PrinterGenDemo(T printSomething){
        this.printSomething = printSomething;
    }
    // Getter
    public void print() {
        System.out.println(printSomething);
    }
    
}
