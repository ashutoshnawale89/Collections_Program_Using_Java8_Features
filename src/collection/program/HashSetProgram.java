package collection.program;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class HashSetProgram {
    public void printSet(){
        HashSet<String> set=new HashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.forEach(j -> System.out.println(j));
    }
    public void removeElement(){
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Arun");
        set.add("Sumit");
        System.out.println("An initial list of elements: "+set);
        //Removing specific element from HashSet
        String value1 = set.stream().filter(i -> i == "Ravi").collect(Collectors.toList()).toString();
        if (value1.length() == 0)
            System.out.println("Not Found in list ");
        else
            set.remove(value1);
        System.out.println("After invoking remove(object) method: "+set);

        HashSet<String> set1=new HashSet<String>();
        set1.add("Ajay");
        set1.add("Gaurav");
        set.addAll(set1);
        System.out.println("Updated List: "+set);
        //Removing all the new elements from HashSet
        set.removeAll(set1);
        System.out.println("After invoking removeAll() method: "+set);
        //Removing elements on the basis of specified condition
        set.remove("Vijay");
        System.out.println("After invoking removeIf() method: "+set);
        //Removing all the elements available in the set
        set.clear();
        System.out.println("After invoking clear() method: "+set);
}


    public static void main(String[] args) {
     HashSetProgram obj = new HashSetProgram();
     obj.printSet();
     obj.removeElement();
    }
}