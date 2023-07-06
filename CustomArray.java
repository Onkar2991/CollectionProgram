package Collection;

public class CustomArray {

    int s;
    int capcity;

    Object arr[];

    CustomArray(){
        s=0;
        capcity=15;
        arr =new Object[capcity];
    }
    Object add(Object element)
    {
        return arr[s++]=element;
    }
    int size()
    {
        return s;
    }
Object get(int Index){
        return arr[Index];
}

    public static void main(String[] args) {
        CustomArray obj=new CustomArray();
        obj.add(14);
        obj.add("shubham");
        obj.add("akash");
        obj.add(0.12);
        for(int i=0;i<obj.size();i++)
        {
            System.out.println(obj.get(i));
        }
    }

}
