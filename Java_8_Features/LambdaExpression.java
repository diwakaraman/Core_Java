package Java8Features;
//-------------------------------------------------anonymous class example--------------------------------------------------------------
//public class LambdaExpression {
//    public static <Greeting> void main(String[] args) {
//
//        interface Greeting {
//            void sayHello();
//        }
//        Greeting obj = new Greeting() {
//                                                       //this is anonymous class
//            public void sayHello() {
//                System.out.println("Hello from Anonymous Class");
//            }
//        };                                          //anonymous class close
//
//        obj.sayHello();
//    }
//}
//-----------------------------------------------Lambda expression exapmle-----------------------------------------------------------------
//public class LambdaExpression {
//    public static<Greeting> void main(String[] args) {
//        interface  Greeting {
//            void sayHello();
//        };
//
//
//        Greeting obj = () ->                            //lambda expression start (remove modifire,return type,name)
//                System.out.println("Hello from Lambda expression ");
//
//        obj.sayHello();
//    }
//}

//---------------------------------add two number using anonymous class------------------------------------------
//interface Add {
//    int sum(int a, int b);
//}
//
//public class LambdaExpression {
//    public static void main(String[] args) {
//
//        Add obj = new Add() {
//            public int sum(int a, int b) {
//                return a + b;
//            }
//        };
//
//        int result = obj.sum(10, 20);
//        System.out.println("Sum = " + result);
//    }
//}

//---------------------------add exapmle using lambda expression-----------------------------------------------------------------
interface Add {
    int sum(int a, int b);
}

public class LambdaExpression {
    public static void main(String[] args) {

        Add obj = (a, b) -> a + b;

        int result = obj.sum(10, 20);
        System.out.println("Sum = " + result);
    }
}







