package Java8Features;

interface Default{
    default void print(){
        System.out.println("Hello this is default method");   //method body
    }
}

public class LearnDefaultMethod implements Default{       //implement the interface
    static void main() {
        LearnDefaultMethod learn = new LearnDefaultMethod();
        learn.print();

    }
}
