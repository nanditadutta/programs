import java.io.*;
import java.util.List;
import java.util.ArrayList;
  
class solution21 {
    public static void main(String[] args)
    {
        List<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
  
        // Error: incompatible types: Object[]
        // cannot be converted to Integer[]
        Integer[] objects = al.toArray();
  
        for (Integer obj : objects)
            System.out.println(obj);
    }
}
