package Linklist;

import java.util.*;

public class libararylinklist {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.addFirst("i");
        list.addLast("am");

        System.out.println(list);

        list.removeFirst();

        System.out.println(list);

        System.out.println(list.size());

    }
}
