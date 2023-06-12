package collection.program;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkHashSetProgram {
    public void printSet(){
        LinkedHashSet<String> set=new LinkedHashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Two");
        set.forEach(i -> System.out.println(i));
    }
    public void removing(){
        LinkedHashSet<String> value = new LinkedHashSet<String>();
        value.add("Java");
        value.add("T");
        value.add("Point");
        value.add("Good");
        value.add("Website");



        System.out.println("The hash set is: " + value);

        System.out.println(" Removing 'Good' : "+" "+value.remove("Good"));

        System.out.println("After removing the element, the hash set is: " + value);

        System.out.println("'For' Removing : "+value.remove("For"));
        System.out.println("After removing the element, the hash set is: " + value);

    }


    public static void main(String[] args) {
        LinkHashSetProgram obj = new LinkHashSetProgram();
        obj.printSet();
        obj.removing();
    }
}
