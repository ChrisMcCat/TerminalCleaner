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


        //dodanie nowego elementu na poczatek listy
        int[] arrayThree = new int[] {3, 5, 3, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arrayThree));
        int[] arrayThreeCopy = Arrays.copyOf(arrayThree, 8);
        System.out.println(Arrays.toString(arrayThreeCopy));
        for (int i = 0; i<arrayThreeCopy.length-1; i++) {
            arrayThreeCopy[arrayThreeCopy.length-1-i]=arrayThreeCopy[arrayThreeCopy.length-2-i];
        }
        System.out.println(Arrays.toString(arrayThreeCopy));
        arrayThreeCopy[0] = 5;
        System.out.println(Arrays.toString(arrayThreeCopy));
    }
}