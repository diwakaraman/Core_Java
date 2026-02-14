package Collections;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<String> v = new Vector<String>();
        v.add("A");
        v.add("B");
        v.add("C");

        System.out.println(v);
        v.add("D");    //after add the element
        System.out.println(v);

        v.remove("A");    //remove the element
        System.out.println(v);

        v.clear();    //clear all the element
        System.out.println(v);


    }
}
