package Collections;
import java.util.*;
class Emp1{
    double age;
    double salary;
    String Name;
    public Emp1(double age, double salary, String Name){
        this.age=age;
        this.salary=salary;
        this.Name=Name;
    }
}
class SalaryComparator implements Comparator{
    public int compare(Object o1, Object o2){
        Emp1 e1 = (Emp1)o1;
        Emp1 e2 = (Emp1)o2;
        if(e1.salary == e2.salary){
            return 0;
        }
        else if(e1.salary>e2.salary){
            return 1;
        }
        else {
            return -1;
        }
    }
}
public class Q2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(new Emp1(29,60000,"khushboo chaudhary"));
        al.add(new Emp1(23,40000,"divya chaudhary"));
        al.add(new Emp1(25,20000,"yogita chaudhary"));
        System.out.println("Sorting by Salary");
        //System.out.println("Sorting by Salary");
        Collections.sort(al, new SalaryComparator());
        Iterator itr2 = al.iterator();
        while (itr2.hasNext()){
            Emp1 e =(Emp1)itr2.next();
            System.out.println(e.age + " " + e.Name + " " + e.salary);
        }
    }
}