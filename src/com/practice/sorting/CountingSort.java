//Sorting technique based on keys between specific range.
//Count the number of occurences of the keys and use this data to place the keys in new array
package com.practice.sorting;

public class CountingSort {

    public static int[] countingSort(int arr[]){

        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < minElement){
                minElement = arr[i];
            }
            if(arr[i] > maxElement){
                maxElement = arr[i];
            }
        }

        int countArray[] = new int[maxElement - minElement + 1];

        for(int i = 0;  i < arr.length; i++){
            countArray[arr[i] - minElement]++;
        }

        for(int i = 1;  i < countArray.length; i++){
            countArray[i] += countArray[i-1];
        }

        int newArray[] = new int[arr.length];

        for(int i = 0;  i < arr.length; i++){
            newArray[countArray[arr[i] - minElement] - 1] = arr[i];
            countArray[arr[i] - minElement]--;
        }

        return newArray;
    }

    public static void printArray(int arr[]){

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {10,5,8,23,12,89,56,34,82,19};
        printArray(countingSort(arr));
    }

}
