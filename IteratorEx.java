package Collection;

import java.util.LinkedList;

public class IteratorEx {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();
        obj.add(1);
        obj.add(2);
        obj.add(33);
        obj.add(1);
        obj.add(65);
        obj.add(41);
        obj.add(42);
        obj.add(43);
        obj.add(44);
        obj.add(45);
        obj.add(46);
        obj.add(47);
        obj.add(48);
        obj.add(50);
        obj.add(51);
        obj.add(53);
        obj.add(54);
        obj.add(55);
        obj.add(56);


//        Iterator<Integer> i = obj.iterator();
//        while (i.hasNext())
//        {
//            System.out.println(i.next());
//        }


//       for (int i=0 ; i<obj.size();i++)
//        {
//            System.out.println(obj.get(i));
//        }


//        ListIterator e = obj.listIterator();
//        while(e.hasNext())
//        {
//            System.out.println(e.next());
//        }

//        ListIterator e = obj.listIterator();
//        while(e.hasNext())
//        {
//            obj.add(55);         //ConcurrentModificationException bcz we cant modify while iteration
//              System.out.println(e.next());
//        }
//        while(e.hasPrevious())
//        {
//            System.out.println(e.previous()); //if we dont have any element to be checked from which we have to check for previous is gives nothing
//        }







    }
}
