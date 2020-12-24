//Idea is to create max heap and then replace the root element with the last element in the array and call heapify on n - 1 elements
package com.practice.sorting;

public class HeapSort {


    public static void heapSort(int arr[], int n){

        for(int i = n/2 - 1; i >=0; i--){
            heapify(arr, n ,i);
        }

        for(int i = n - 1; i > 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }

    public static void heapify(int arr[], int n, int i){

        int largest = i;

        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if(left < n && arr[largest] < arr[left]){
            largest = left;
        }

        if(right < n && arr[largest] < arr[right]){
            largest = right;
        }

        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    public static void printArray(int arr[]){

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int arr[] = {10,5,8,23,12,89,56,34,82,19};
        heapSort(arr, arr.length );
        printArray(arr);

    }
}
