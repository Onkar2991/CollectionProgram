package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashmapEx {
    public static void main(String[] args) {

        Map<Integer,String> ok= new HashMap<>();
        ok.put(20,"shubham");
        ok.put(5,"shubham");
        ok.put(60,"onkar");
        ok.put(70,"akee");
        ok.put(4,"saurabh");

        System.out.println(ok);

        System.out.println(ok.size());
        System.out.println(ok.get(60));
        System.out.println(ok.containsKey(20));
        System.out.println(ok.hashCode());
        System.out.println(ok.isEmpty());
//      ok.clear();
//      System.out.println(ok);
        System.out.println(ok.entrySet());
        System.out.println(ok.keySet());
        System.out.println(ok.containsValue("param"));
//      System.out.println(ok.remove(60,"onkar"));
//      System.out.println(ok);

        System.out.println(ok.putIfAbsent(100,"angad"));
        System.out.println(ok);





    }
}
