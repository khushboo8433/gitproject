import java.util.*;

public class Q1{
    public static void main(String[] Args){
        Scanner sc=new Scanner(System.in);
        List<Float> list1= new ArrayList();
        System.out.println("Enter 5 floating values");
        for(int i=0;i<5;i++){
            float temp=sc.nextFloat();
            list1.add(temp);
        }
        float sum=0.0f;
        Iterator<Float> iter= list1.iterator();
        while (iter.hasNext()) {
            sum+=iter.next();
        }
        System.out.println("Sum is : "+sum);
    }
}