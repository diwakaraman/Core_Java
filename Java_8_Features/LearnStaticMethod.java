package Java8Features;

interface a{
    static void print(){
        System.out.println("Hello this is default method");
    }
}

public class LearnStaticMethod {
    public static void main(String[] args) {  //can not make object direct call the interface and method
                                     //ager apko object banana hi to uske liye EK default method banana pdega
                                     //static me sath
        a.print();
    }
}
