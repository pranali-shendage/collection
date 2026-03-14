import java.util.*;
public class Addall{
public static void main(String []x){

ArrayList a1=new ArrayList();
a1.add(10);
a1.add("java");
a1.add(56);
a1.add('c');
a1.add(5.5f);

System.out.println(a1);

/*    ArrayList a2=new ArrayList();
  a2.add("aaa");
  a2.add("cccc");
System.out.println(a2);
   a1.addAll(a2);          */
// System.out.println(a1.add("i love my family"));
    
//System.out.println(a1);

   //System.out.println(a1.contains(56));

   //System.out.println(a1.isEmpty());
 System.out.println(a1.size());
    a1.remove(10);
System.out.println(a1);


 }
}