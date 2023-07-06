package Collection;

import javafx.print.Collation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class middle_name implements Comparator<ComparatorComparable>{


    @Override
    public int compare(ComparatorComparable o1, ComparatorComparable o2) {
        return o1.getMiddle_name().compareTo(o2.getMiddle_name());
    }
}
class last_name implements Comparator<ComparatorComparable> {


    @Override
    public int compare(ComparatorComparable o1, ComparatorComparable o2) {
        return o1.getLast_name().compareTo(o2.getLast_name());
    }
}


class id implements Comparator<ComparatorComparable>{

    @Override
    public int compare(ComparatorComparable o1, ComparatorComparable o2) {
        return o1.getId()-o2.getId();
    }
}

class salary implements Comparator<ComparatorComparable>{

    @Override
    public int compare(ComparatorComparable o1, ComparatorComparable o2) {
        if (o1.getSalary()>o2.getSalary())
        {
            return 1;
        } else if (o1.getSalary()<o2.getSalary()) {
            return -1;
        }
        return 0;
    }
}


public class ComparatorComparable implements Comparable<ComparatorComparable> {


    private String first_name;
    private String last_name;
    private String middle_name;
    private int id;
    private double salary;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ComparatorComparable(String first_name, String last_name, String middle_name, int id, double salary) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.middle_name = middle_name;
        this.id = id;
        this.salary = salary;
    }

    @Override
    public int compareTo(ComparatorComparable o) {
        return this.getFirst_name().compareTo(o.getFirst_name());
    }

    @Override
    public String toString() {
        return "ComparatorComparable{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", middle_name='" + middle_name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}






     class test {
         public static void main(String[] args) {

             ComparatorComparable na=new ComparatorComparable("onkar","bijjamwar","gajanan",12,12500);
             ComparatorComparable na1=new ComparatorComparable("param","karbhari","shivsharan",13,1000);
             ComparatorComparable na3=new ComparatorComparable("akash","biradar","shubham",1,35000);


             List<ComparatorComparable> li=new ArrayList<> ();
             li.add(na);
             li.add(na1);
             li.add(na3);

             Collections.sort(li);
             System.out.println("sorted list"+li);


             middle_name aa=new middle_name();
             Collections.sort(li,aa);
             System.out.println("sorted middle name list"+li);

             last_name ab=new last_name();
             Collections.sort(li,ab);
             System.out.println("sorted last name list"+li);


             id ac= new id();
             Collections.sort(li,ac);
             System.out.println("sorted id list"+li);

             salary sc= new salary();
             Collections.sort(li,sc);
             System.out.println("sorted salary list"+li);
         }

     }
