import java.util.*;
public class Sum{
public static void main(String []x){
  
 ArrayList<Integer>list=new ArrayList<>();
  
 list.add(10);
list.add(20);
list.add(30);
list.add(40);
list.add(50);
list.add(10);

int sum=0;

for(int i=0;i<list.size();i++)
 {
    sum= sum +list.get(i);
}
  System.out.println("sum:"+sum);

 }

}