package Collections;
import java.util.*;
class Emp12{
    double age;
    double salary;
    String firstName;
    String lastName;
    public Emp12(double age, double salary, String firstName,String lastName){
        this.age=age;
        this.salary=salary;
        this.firstName=firstName;
        this.lastName=lastName;
    }
}
public class Q2a {
    public static void main(String[] args) {
        Set <String>al= new TreeSet<>();
        Emp12 e1=new Emp12(29,60000,"khushboo","chaudhary");
      Emp12 e2= new Emp12(23,40000,"divya","rani");
      Emp12 e3= new Emp12(25,20000,"yogita","kumari");

        System.out.println("Sorting by firstname");
        al.add(e1.firstName);
        al.add(e2.firstName);
        al.add(e3.firstName);
        for(String ele:al)
        {
            System.out.println(ele);
        }
    }
}
