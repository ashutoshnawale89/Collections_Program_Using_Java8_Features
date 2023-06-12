package collection.program;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LinkListProgram {
    public void simplePrint(){
        LinkedList<String> value =new LinkedList<>();
        value.add("One");
        value.add("Two");
        value.add("Three");
        value.add("Four");
        value.add("Five");
        value.add("Six");
        value.forEach(i -> System.out.println(i));
    }

    public void sortList(){
        ArrayList<Integer> value =new ArrayList<>();
        value.add(1);
        value.add(5);
        value.add(8);
        value.add(2);
        value.add(3);
        value.add(6);
        value.add(6);

        value.stream().sorted().forEach(i -> System.out.println(i));
    }

    public  void searchValue(){
        ArrayList<String> value =new ArrayList<>();
        value.add("One");
        value.add("Two");
        value.add("Three");
        value.add("Four");
        value.add("Five");
        value.add("Six");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Search Value : ");
        String search = sc.nextLine();

        List<String> result =value.stream().filter(i -> i.equals(search)).collect(Collectors.toList());
        if (result.isEmpty())
            System.out.println("Not Fouund........");
        else
            System.out.println("Found the Value");

    }

    public void deleteFirst() {
        LinkedList<String> value = new LinkedList<>();
        value.add("One");
        value.add("Two");
        value.add("Three");
        value.add("Four");
        value.add("Five");
        value.add("Six");
        value.remove(0);
        System.out.println(value);
    }

    public void deleteLast(){
        LinkedList<String> value = new LinkedList<>();
        value.add("One");
        value.add("Two");
        value.add("Three");
        value.add("Four");
        value.add("Five");
        value.add("Six");
        value.remove(value.size()-1);
        System.out.println("Delete last Index value : "+value);
    }


    public static void main(String[] args) {
        LinkListProgram obj = new LinkListProgram();
        obj.simplePrint();
        obj.sortList();
        obj.searchValue();
        obj.deleteFirst();
        obj.deleteLast();
    }
}
