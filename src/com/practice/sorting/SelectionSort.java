//Idea is to swap the current element with the small elements after the current element in the array
package com.practice.sorting;

public class SelectionSort {

    public static void selectionSort(int arr[]){

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void printArray(int arr[]){

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,5,8,23,12,89,56,34,82,19};
        selectionSort(arr);
        printArray(arr);
    }
}
