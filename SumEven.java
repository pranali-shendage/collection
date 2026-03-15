//sum of even numbers
import java.util.*;
public class SumEven{
public static void main(String []x){
  
 ArrayList<Integer>list=new ArrayList<>();
  
 list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.add(50);
list.add(70);
list.add(55);

int sum=0;

for(int i=0;i<list.size();i++)
 {
     if(list.get(i) % 2 ==0){
       sum= sum +list.get(i);
     }
}
  System.out.println("sum:"+sum);

 }

}