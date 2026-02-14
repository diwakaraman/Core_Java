package Collections;

import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {
        int[] arr = {5, 9, 3, 4, 0};
        int index = Arrays.binarySearch(arr, 4);
        System.out.println("the index of element 4 is "+index);


        Integer[] numbers={1,2,3,6,7,8,4,9};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
