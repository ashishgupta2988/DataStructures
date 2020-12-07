package com.practice.array;

import com.practice.array.rotation.RotateArray;

public class LargestSumContiguousArray {

    public void printLargestSumContiguousArray(int arr[]){

        if (arr.length == 0){
            return;
        }
        int maxSum = 0;
        int sum = 0;
        int start = 0;
        int finalStart = 0;
        int end = 0;
        for(int index = 0; index < arr.length; index++){
            sum  = sum + arr[index];
            if(sum < 0){
                sum = 0;
                start = index + 1;
            }
            if(sum > maxSum){
                maxSum = sum;
                finalStart = start;
                end = index;
            }
        }
        System.out.println("largest sum " + maxSum);
        for(int index = finalStart; index <= end; index++){
            System.out.println(arr[index] + " ");
        }
    }

    public static void main(String[] args) {

        int arr[] = {8,-9,10,-11,14,15,1,-3,-4,6};
        int rotateBy = 1;
        LargestSumContiguousArray largestSumContiguousArray = new LargestSumContiguousArray();
        largestSumContiguousArray.printLargestSumContiguousArray(arr);


    }
}
