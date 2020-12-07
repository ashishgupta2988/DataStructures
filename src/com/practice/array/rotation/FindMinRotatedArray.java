package com.practice.array.rotation;

public class FindMinRotatedArray {

    private int findMinElement(int arr[], int low, int high) {

        if(high < low){
            return arr[0];
        }
        if(high == low){
            return arr[high];
        }

        int mid = (low + high)/2;
        if(mid > low && arr[mid] < arr[mid - 1]) {
            return arr[mid];
        }
        if(high > mid && arr[mid] > arr[mid + 1]){
            return arr[mid + 1];
        }
        if(arr[high] > arr[mid]){
            return findMinElement(arr, low, mid - 1);
        }
        else {
            return findMinElement(arr, mid + 1, high);
        }

    }

    public static void main(String[] args) {

        int arr[] = {8,9,10,11,14,15,1,3,4,6};
        FindMinRotatedArray findMinRotatedArray = new FindMinRotatedArray();
        System.out.println(findMinRotatedArray.findMinElement(arr,0, arr.length - 1));
    }
}
