package ArrayList;

import java.util.ArrayList;

public class TC_01 {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String>list2=new ArrayList<>();
        ArrayList<Boolean>list3=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1,20);
        System.out.println(list);
        System.out.println("list pf size"+" "+list.size());

        //print the array list
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+", ");
        }
        System.out.println();


        //get operation
//        int element=list.get(1);
//        System.out.println("element at index 1 is"+" "+element);

        //remove
//        list.remove(2);
//        System.out.println(list);
//
       //set element at index
//        list.set(2,9);
//        System.out.println(list);

        //contains element
//        System.out.println(list.contains(1));
//        System.out.println(list.contains(11));


    }
}
