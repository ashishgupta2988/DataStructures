package com.practice.array.rotation;

public class FindMaxRotatedArray {

    private int findMaxElement(int arr[], int low, int high){

        if(high < low){
            return arr[arr.length -1];
        }
        if(high == low){
            System.out.println("Yes");
            return arr[low];
        }

        int mid = (low + high)/2;

        if(mid < high && arr[mid] > arr[mid+1]){
            return arr[mid];
        }
        else if(mid > low && arr[mid] < arr[mid-1]){
            return arr[mid-1];
        }

        if(arr[high] > arr[mid]) {
            return findMaxElement(arr, low, mid-1);
        }
        else{
            return findMaxElement(arr, mid+1, high);
        }


    }

    public static void main(String[] args) {

        //int arr[] = {8,9,13,15,17,3,5, 7};
        int arr[] = {13,15,16,17,3,5,7,9,10,11};
        //int arr[] = {8,9,13,15,17,19};
        FindMaxRotatedArray findMaxRotatedArray = new FindMaxRotatedArray();
        int maxElement = findMaxRotatedArray.findMaxElement(arr, 0, arr.length-1);
        System.out.println("Max Element is: " + maxElement);

    }
}
