package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class LastNameComparator implements Comparator<Empl>{

    @Override
    public int compare(Empl o1, Empl o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}

class MiddleNameComparator implements Comparator<Empl> {

    @Override
    public int compare(Empl o1, Empl o2) {
        return o1.getMiddleName().compareTo(o2.getMiddleName());
    }
}

//natural sorting
//custom sorting

class Empl implements Comparable<Empl>{

    private String firstName;
    private String lastName;
    private String middleName;
    private int age;
    private double salary;

    public Empl(){

    }

    public Empl(String firstName, String middleName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public int compareTo(Empl o) {
        //return this.getAge() - o.getAge();
        return this.getFirstName().compareTo(o.getFirstName());
    }

    @Override
    public String toString() {
        return "Empl{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

public class ComparableTest {

    public static void main(String[] args) {
        Empl emp1 = new Empl("Akash","Umakant","Biradar", 26, 60000);
        Empl emp2 = new Empl("Prathamesh","Pravin","Mahamune", 24, 75000);
        Empl emp3 = new Empl("Saurabh","Shankarrao","Patil", 25, 150000);
        Empl emp4 = new Empl("Akshay","Ganesh","Boinol", 27, 75000);
        Empl emp5 = new Empl("Vijay","Maroti","Kapdewad", 25, 80000);

        List<Empl> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);

        Collections.sort(empList);
        System.out.println("First name sorting "+empList); //

        MiddleNameComparator comparator = new MiddleNameComparator();
        Collections.sort(empList, comparator);
        System.out.println("Middle name sorting "+empList);   //


        LastNameComparator comparatorLast = new LastNameComparator();
        Collections.sort(empList, comparatorLast);
        System.out.println("Last name sorting "+empList);   //
    }
}
