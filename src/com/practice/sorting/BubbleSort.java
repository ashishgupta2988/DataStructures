//Idea is to compare the two elements and swap the elements if element at lower indx is greater than element at higher index
//Such that after first iteration max element is set at last position
package com.practice.sorting;

public class BubbleSort {

    public static void bubbleSort(int arr[]){

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
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
        bubbleSort(arr);
        printArray(arr);
    }
}
