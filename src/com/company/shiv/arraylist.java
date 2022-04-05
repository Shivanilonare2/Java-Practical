package com.company.shiv;
import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(2);
        list.add(8);
        list.add(5);
        list.add(1);
        Iterator i = list.iterator();
        Collections.reverse(list);
        Collections.sort(list);
        while(i.hasNext())
            System.out.print(i.next() + " ");
    }
}
