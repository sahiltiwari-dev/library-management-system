package dsa;
import java.util.*;
public class AArrayList
{

    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<Integer>();
      // ArrayList<String> list2 = new ArrayList<String>();
      // ArrayList<Boolean> list3 = new ArrayList<Boolean>();

       //add elements we use list.add(number)
       list.add(0);
       list.add(1);
       list.add(5);
       System.out.println(list);


       //get elements we use list.get(index)
       System.out.println("the element at 2nd index is "+list.get(2));

       //add element anywhere in between  we use list.add(index where we want to add, number we want to add)
       list.add(1,10);
       System.out.println(list);


       //set element kisi bhi position pe jo pahela element that usko remove karke naya element kar denge
       list.set(0,2);// 0 index par 0 tha usko change karke 2 kar denge 
       System.out.println(list);

       //remove  element
       list.remove(2);
       System.out.println(list);

       // size of array list it is always index +1
       System.out.println(list.size());


       // how to apply loops to array list 
       System.out.println("the elements of lists are ");
       for(int i=0;i<list.size();i++)
       {
        System.out.println(list.get(i)+" ");
       }

       //sorting (very important)
       Collections.sort(list);
       System.out.println("sorted array is");
       System.out.println(list);





        
    }
}
