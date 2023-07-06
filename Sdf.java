package Static;

// static block gets executed before the main method

public class Sdf {
    static
    {
        System.out.println("from static block 1");
    }
    static
    {
        System.out.println("from static block 2");
    }

    public static void main(String[] args) {
        System.out.println("from main method");
    }
    static
    {
        System.out.println("from static block 3");
    }
}
