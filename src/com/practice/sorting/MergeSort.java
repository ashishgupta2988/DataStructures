//Idea is to keep dividing the array into subarryays till the array size is 1 and then start merging in sorted manner
package com.practice.sorting;

public class MergeSort {

    public static void merge(int arr[], int low, int mid, int high){

        int array1[] = new int[mid - low + 1];
        int array2[] = new int[high - mid];

        for(int i = low; i <= mid; i++){
            array1[i - low] = arr[i];
        }

        for(int i = mid + 1; i <= high; i++){
            array2[i - mid -  1] = arr[i];
        }

        int j = 0, k = mid - low + 1;
        int l = 0, m = high - mid;

        while(j < k && l < m){
            if(array1[j] < array2[l]){
                arr[low] = array1[j];
                j++;
            }
            else{
                arr[low] = array2[l];
                l++;
            }
            low++;
        }

        while(j < k){
            arr[low] = array1[j];
            j++;
            low++;
        }


        while(l < m){
            arr[low] = array2[l];
            l++;
            low++;
        }

    }

    public static void  mergeSort(int arr[], int low, int high){

        if(low < high){
            int mid  = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }

    public static void printArray(int arr[]){

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int arr[] = {10,5,8,23,12,89,56,34,82,19};
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);

    }
}
