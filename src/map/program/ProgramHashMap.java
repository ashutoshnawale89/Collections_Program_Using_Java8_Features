package map.program;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ProgramHashMap {
    public void print(){
        HashMap<Integer,String> value = new HashMap<>();
        value.put(1,"Yogesh");
        value.put(2,"Shadab");
        value.put(3,"Raju");
        value.put(4,"Yogita");
        value.put(5,"Ketan");
        System.out.println(value);
        value.forEach((k, v) -> System.out.println((k + ":" + v)));
    }
    public void  remove(){
        HashMap<Integer,String> value = new HashMap<>();
        value.put(1,"Yogesh");
        value.put(2,"Shadab");
        value.put(3,"Raju");
        value.put(4,"Yogita");
        value.put(5,"Ketan");
        System.out.println("Before Removing Value : "+value);
        value.remove(5);
            value.forEach((k, v) -> System.out.println("After Removing Value : "+(k + ":" + v)));
    }
    public void replaceValue(){
        HashMap<Integer,String> value = new HashMap<>();
        value.put(1,"Yogesh");
        value.put(2,"Shadab");
        value.put(3,"Raju");
        value.put(4,"Yogita");
        value.put(5,"Ketan");
        System.out.println("Before Replacing Value : "+value);
        value.replace(4,"Yogita","Nikita");
        value.forEach((k, v) -> System.out.println("After Replacing Value : "+(k + ":" + v)));
    }

    public static void main(String[] args) {
        ProgramHashMap obj =new ProgramHashMap();
        obj.print();
        obj.remove();
        obj.replaceValue();
    }
}
