package core;

public class Instance {
    int x=10;

    static void setInstace() {
        Instance t1 = new Instance();
        Instance t2 = new Instance();

        System.out.println(t1.x);
        System.out.println(t2.x);
    }
}
