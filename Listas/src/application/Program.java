package application;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Marcos");
        list.add("Bob");
        list.add("Ana");
        list.add("Zeze");
        list.add(2,"Zeze Poleça");

        for (String s : list) {
            System.out.println(s);
        }



    }
}
