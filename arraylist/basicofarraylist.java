package arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

class basicOfArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<String> list2 = new ArrayList<String>();
        ArrayList<Boolean> list3 = new ArrayList<Boolean>();
        // add
        list.add(0);
        list.add(100);
        list.add(-12);

        System.out.println(list);

        // get

        System.out.println(list.get(2));

        // add a element in between
        list.add(0, 100000);
        System.out.println(list);

        // set element
        list.set(0, 5);
        System.out.println(list);

        // remove element
        list.remove(3);
        System.out.println(list);

        // size
        System.out.println(list.size());

        // collections / sorts

        // Collection.sorts(list);
        System.out.println(list);
    }
}
