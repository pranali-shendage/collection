/*Q1. Create an ArrayList of integers. Add 5 numbers and display all elements using a loop.
Explanation:
	This helps you understand:
How to declare an ArrayList
How to add elements using add()
How to traverse an ArrayList using for loop
*/

import java.util.*;
public class AddNumbers{
public static void main(String []x){

ArrayList<Integer>a1=new ArrayList();
 a1.add(10);
a1.add(20);
a1.add(30);
a1.add(40);
a1.add(50);
a1.add(60);

for(int ar:a1)
{
 System.out.print(ar +" ");
}

 }
}