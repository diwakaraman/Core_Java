package Collections;

class LinkedList {
    public static void main(String[] args) {

        java.util.LinkedList<Integer> list = new java.util.LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.addFirst(5);
        list.addLast(40);

        System.out.println(list);
    }
}
