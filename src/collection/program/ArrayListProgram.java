package collection.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayListProgram {
    public void simplePrint(){
        ArrayList<String> value =new ArrayList<>();
        value.add("One");
        value.add("Two");
        value.add("Three");
        value.add("Four");
        value.add("Five");
        value.add("Six");
        value.forEach(i -> System.out.println(i));
    }

    public void sortArray(){
        ArrayList<Integer> value =new ArrayList<>();
        value.add(1);
        value.add(5);
        value.add(8);
        value.add(2);
        value.add(3);
        value.add(6);
        value.add(6);
        List<Integer> result=value.stream().sorted().collect(Collectors.toList());
        result.forEach(i -> System.out.println(i));
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
        List<String> result=value.stream().filter(i -> i == search).collect(Collectors.toList());
        if (result.size() == 0)
            System.out.println("Found the list");
        else
            System.out.println("Not found in the list");
    }
    public static void main(String[] args) {
        ArrayListProgram obj = new ArrayListProgram();
        obj.simplePrint();
        obj.sortArray();
        obj.searchValue();
}
}
