package Collections;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet
{
    public static void main(String[] args) {
//      Set<String> set = new TreeSet<String>();  //sorted from all element
 //       Set<String> set = new HashSet<>();  // order not guaranteed
        Set<String> set = new LinkedHashSet<>();//order acccoring to you add
      set.add("e");
      set.add("b");
      set.add("g");
      set.add("d");
      set.add("a");
      set.add("z");
        System.out.println(set);

        set.remove("z");
        System.out.println(set);


        System.out.println(set.contains("hg"));  //element is present or not if present then "yes" otherwise "No".
    }
}
