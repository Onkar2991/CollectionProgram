package Static;


//when we have local and global variable of same name , if just a varible name is used then it gives us the local varible value
//if we use class name.varible name then only it will give u the satic varible value


public class Onkar {
    static int a;


    public static void main(String[] args) {

        a=40;
        System.out.println(Onkar.a); //40
        System.out.println(Onkar.add());
    }
     public static int add()
    {
        System.out.println(a); //40
        int a= 45;
        System.out.println(Onkar.a);//40
//        System.out.println(a);
        return a ;//45
    }
}
