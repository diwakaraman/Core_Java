package Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LearnStream {
    static void main() {


      List<Integer> collect = Stream.iterate(0,x->x+1)

              .limit(101)
              .skip(1)                     //skip first element
              .filter(x->x%2==0)         //filter the even numbers
              .map(x->x/10)             //every even number devide by 2 ho jayegi
              .sorted()                          //used for sorted element
//              .peek(x-> System.out.println(x))   //if you are take in action in between program.

              .collect(Collectors.toList());
      collect.forEach(System.out::println);




    }
}
