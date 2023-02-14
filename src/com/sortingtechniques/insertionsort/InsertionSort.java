package com.sortingtechniques.insertionsort;

public class InsertionSort {
    public static void insertionSort(int arr[]){
        //[ 5 | 4 | 1 | 3 | 2 ]
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int previous = i-1;

            while (previous >= 0 && arr[previous] > current){
                arr[previous+1] = arr[previous];
                previous--;
            }
            arr[previous+1] = current;
        }
    }

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        insertionSort(arr);
        printArr(arr);
    }
}
