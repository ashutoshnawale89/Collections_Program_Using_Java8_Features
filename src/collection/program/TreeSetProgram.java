package collection.program;

import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class TreeSetProgram {
    public void printTreeSet(){
        TreeSet<String> value=new TreeSet<String>();
        value.add("Ravi");
        value.add("Vijay");
        value.add("Ravi");
        value.add("Ajay");
        //Traversing elements
        value.forEach(i -> System.out.print(i+" "));
        System.out.println(" ");
    }

    public void decendingOrder(){
        TreeSet<String> set=new TreeSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ajay");
        System.out.println("Traversing element through Iterator in descending order");
        List<String> result= set.stream().sorted().collect(Collectors.toList());
        System.out.println(result);
    }
    public void highestAndLowestValue(){
        TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(24);
        set.add(66);
        set.add(12);
        set.add(15);
        int num =0;
        int max1 = set.stream().max(Integer::compare).get();
        int min1 = set.stream().min(Integer::compare).get();

        System.out.println("Lowest Value: "+min1);
        System.out.println("Highest Value: "+max1);
    }
    public void removeValue(){
        TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(24);
        set.add(66);
        set.add(12);
        set.add(15);
        System.out.println("Before Delete value : "+set);
        set.remove(66);
        System.out.println("After Delete value : "+set);
    }

    public static void main(String[] args) {
        TreeSetProgram obj = new TreeSetProgram();
        obj.printTreeSet();
        obj.decendingOrder();
        obj.highestAndLowestValue();
        obj.removeValue();
    }

}
