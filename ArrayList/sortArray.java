package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class sortArray {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int tmp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, tmp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);
        Collections.sort(list);//ascending
        System.out.println(list);
        //descending order
        Collections.sort(list,Collections.reverseOrder());
        //comparator -fnx logic
        System.out.println(list);


    }
}