package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnCollectionsClass {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);

        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("min element inside collection list "+Collections.min(list));
        System.out.println("max element inside collection list "+Collections.max(list));
        System.out.println(Collections.frequency(list,5));  //kitni bar 5 aya hai
    }
}
