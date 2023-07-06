package Collection;

import java.util.*;

public class Comparatorss  {
    public static void main(String[] args) {
        veer ok = new veer("param", "shiv", "karbhari", 23);
        veer ok1 = new veer("veer", "kumar", "nila", 10);
        veer ok2 = new veer("onkar", "anna", "bijjamwar", 12);
        List<veer> obj = new ArrayList();
        obj.add(ok);
        obj.add(ok1);
        obj.add(ok2);
        Collections.sort(obj);
        System.out.println(obj);
        middle_name1 done = new middle_name1();
        Collections.sort(obj, done);
        System.out.println("comparator:" + obj);
        //Last_name1 done1=new Last_name1();
        // System.out.println(obj.toString());


    }
    class Last_name1 implements Comparator<veer>{

        @Override
        public int compare(veer o1, veer o2) {
            return o1.getLast_name().compareTo(o2.getLast_name());
        }
    }

    }
class middle_name1 implements Comparator<veer> {

    @Override
    public int compare(veer o1, veer o2) {
        return o1.getMiddle_name().compareTo(o2.getMiddle_name());
    }
}
class veer implements Comparable<veer> {

    private String first_name;
    private String middle_name;
    private String last_name;
    private int id;
    public veer(String first_name, String middle_name, String last_name, int id) {
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "veer{" +
                "first_name='" + first_name + '\'' +
                ", middle_name='" + middle_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", id=" + id +
                '}';
    }
veer(){

}

    @Override
    public int compareTo(veer o) {
        return this.getFirst_name().compareTo(o.first_name);
    }


}

