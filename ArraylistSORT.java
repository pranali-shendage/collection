/*Q3. Take an ArrayList of integers, convert it to a Vector, then sort the Vector in ascending order manually (without using Collections.sort).
What you practice:
ArrayList → Vector conversion
Manual sorting (bubble sort / selection sort)
Vector methods like add(), get(), set()
*/


import java.util.ArrayList;
import java.util.Vector;

public class ArraylistSORT {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(10);
        list.add(30);
        list.add(20);

        Vector<Integer> vec = new Vector<>();

        // Convert
        for(int i = 0; i < list.size(); i++) {
            vec.add(list.get(i));
        }

        // Bubble Sort
        for(int i = 0; i < vec.size() - 1; i++) {
            for(int j = 0; j < vec.size() - i - 1; j++) {

                if(vec.get(j) > vec.get(j + 1)) {

                    int temp = vec.get(j);
                    vec.set(j, vec.get(j + 1));
                    vec.set(j + 1, temp);
                }
            }
        }

        System.out.println(vec);
    }
}