 
import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(18);
        arr.add(52);
        arr.add(89);
        arr.add(69);
        arr.add(77);

        System.out.println(arr.get(2));

        arr.set(3,96); //value ko change krne ke liye 
        System.out.println(arr.get(3)); //assign karne ya update karne ke liye

        System.out.println(arr); // arraylist print

        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }

        System.out.println();

        for(int ele :arr){
          System.out.print(ele+" ");   
        }
       System.out.println();

       arr.add(100);
       arr.add(2, 100);
       System.out.println(arr);
       arr.remove(arr.size()-1);
       System.out.println(arr);

       Collections.reverse(arr);
       System.out.println(arr);

       int i = 0 ;
       int j = arr.size()-1 ;
        while (i<j) {
           int temp = arr.get(i);
           arr.set(i, arr.get(j)) ;
           arr.set(j, temp);
           i++;
           j--;
        }

       System.out.println(arr);
    }
}
