package com.practice.array.rotation;

public class RotateArrayUsingReverse {

    private void reverseArray(int arr[], int start, int end){

        int temp;
        while(start < end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    private void rotateArrayUsingReverseApproach(int arr[], int rotateBy){

        reverseArray(arr, 0, rotateBy - 1); //10 9 8 11 14 15 1 3 4 6
        reverseArray(arr, rotateBy, arr.length - 1); //10 9 8 6 4 3 1 15 14 11
        reverseArray(arr,0, arr.length - 1); //11 14 15 1 3 4 6 8 9 10

    }

    public static void main(String[] args) {
        int arr[] = {8,9,10,11,14,15,1,3,4,6};
        int rotateBy = 3;
        RotateArrayUsingReverse rotateArrayUsingReverse = new RotateArrayUsingReverse();
        rotateArrayUsingReverse.rotateArrayUsingReverseApproach(arr, rotateBy);
        for (int index = 0; index < arr.length; index++){
            System.out.println(arr[index]);
        }
    }
}
