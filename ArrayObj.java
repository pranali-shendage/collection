//colleation array

public class ArrayObj{
public static void main(String x[]){

 Object[] obj=new Object[4];
  obj[0]=5;
  obj[1]="java";
  obj[2]=false;
  obj[3]=5.7f;

for(Object o:obj)
{
 System.out.println(o);
 }

}
}