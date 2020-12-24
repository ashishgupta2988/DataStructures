package com.practice.sorting;

public class QuickSort {

    public static int partition(int arr[], int low, int high){

       int i = low -1;
       int pivot = arr[high]; //last element as pivot
       for(int j = low; j < high; j++){
           if(arr[j] < pivot){
               i++;
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
           }
       }
       int temp = arr[i+1];
       arr[i+1] = arr[high];
       arr[high] = temp;

       return i + 1;
    }

    public static void quickSort(int arr[], int low, int high){

        if(low < high){
            int p = partition(arr, low, high);
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    public static void printArray(int arr[]){

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int arr[] = {10,5,8,23,12,89,56,34,82,19};
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);

    }
}
