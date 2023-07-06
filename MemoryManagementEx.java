package Static;

public class MemoryManagementEx {
    static String name="ONKAR";
    String adress="pune";

    public static void main(String[] args) {

        MemoryManagementEx aa= new MemoryManagementEx();
        aa.name="shubham";
        aa.adress="nanded";
        System.out.println(aa.name);  //shubam  gets the updated value  no new object is created
        System.out.println(aa.adress);//nanded    new object is created


        MemoryManagementEx bb= new MemoryManagementEx();
        bb.adress="shivne";
        bb.name ="Akash";
        System.out.println(bb.adress);//shivne   new object is created
        System.out.println(bb.name);//Akash  gets the updated value    no new object is created

    }

}
