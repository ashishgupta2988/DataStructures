package com.practice.array.rotation;

public class PairSumSortedRotatedArray {


    private boolean findPairSumInRotatedSortedArray(int arr[], int sum){

        int index;
        int arrayLength = arr.length;
        for(index = 0; index < arr.length - 1; index++){
            if(arr[index] > arr[index + 1]){
                break;
            }
        }
        int start = (index + 1) % arrayLength;
        int end = index;

        while(start != end){
            if(arr[start] + arr[end] == sum){
                return true;
            }
            if(arr[start] + arr[end] <= sum){
                start = (start + 1) % arrayLength;
            }
            else{
                end = (end - 1) % arrayLength;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int arr[] = {8,9,10,11,14,15,1,3,4,6};
        int sum =29;
        PairSumSortedRotatedArray pairSumSortedRotatedArray = new PairSumSortedRotatedArray();
        System.out.println(pairSumSortedRotatedArray.findPairSumInRotatedSortedArray(arr,sum));
    }
}
