//Idea is to compare every element with the previous elements and keep on swapping if previos element is greater than the current element
package com.practice.sorting;

public class InsertionSort {


    public static void insertionSort(int arr[]){

        for(int i = 1; i < arr.length; i++){
            int key = arr[i], j = i - 1;

            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] =  key;
        }
    }

    public static void printArray(int arr[]){

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,5,8,23,12,89,56,34,82,19};
        insertionSort(arr);
        printArray(arr);
    }
}
