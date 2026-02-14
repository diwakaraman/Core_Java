package Collections;

import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {
    static void main() {

        List list = new ArrayList();   //  list banaya
        list.add(1);                //    add kiya element ko
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list );
        list.add(6);                     //new element fir se add kiya
        System.out.println(list );

        List<Integer> newList = new ArrayList();
        newList.add(100);
        newList.add(200);
        list.addAll(newList);   //new element add
        System.out.println("after add new element "+list );

        System.out.println("get the element of index 2 is->  "+ list.get(2));

        list.remove(2);        //remove element form index 2
        System.out.println("after remove element "+list );
    }
}
