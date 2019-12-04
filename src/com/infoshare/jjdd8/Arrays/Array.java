package com.infoshare.jjdd8.Arrays;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] arrayOne = new int[] {5, 3, 6, 7, 9};
        for (int i:arrayOne){
            System.out.println(i);
        }

        int[] arrayTwo = Arrays.copyOf(arrayOne, 10);
        System.out.println(Arrays.toString(arrayTwo));
        Arrays.sort(arrayTwo);
        System.out.println(Arrays.toString(arrayTwo));
    }
}