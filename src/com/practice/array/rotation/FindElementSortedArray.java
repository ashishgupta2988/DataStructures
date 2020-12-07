package com.practice.array.rotation;

public class FindElementSortedArray {

    private int findElementInSortedArray(int arr[], int low, int high, int element){

        if(high < low){
            return -1;
        }

        int mid = (low + high) / 2;
        if(arr[mid] == element){
            return mid;
        }
        if(mid> low && arr[low] <= arr[mid]){
            if(element >= arr[low] && element <= arr[mid]){
                return findElementInSortedArray(arr, low, mid - 1, element);
            }
            else{
                return findElementInSortedArray(arr, mid + 1, high, element);
            }
        }
        else {
            if(element >= arr[mid] && element <= arr[high]){
                return findElementInSortedArray(arr, mid + 1, high, element);
            }
            else {
                return findElementInSortedArray(arr, low, mid - 1, element);
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {8,9,10,11,14,15,1,3,4,6};
        FindElementSortedArray findElementSortedArray = new FindElementSortedArray();
        System.out.println(findElementSortedArray.findElementInSortedArray(arr,0,arr.length -1, 12) + 1);
    }
}
