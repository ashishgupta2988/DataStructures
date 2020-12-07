package com.practice.array.rotation;

public class RotateArray {

    private int gcd(int a, int b){

        if(b == 0){
            return a;
        }

        return gcd(b, a % b);
    }

    private void rotateArray(int arr[], int rotateBy){

        int arrayLength = arr.length;
        int gcd = gcd(arrayLength, rotateBy);

        for(int index = 0; index < gcd; index++){

            int temp = arr[index];
            int tempIndex = index;
            int nextIndex = 0;

            while(true){

                nextIndex = tempIndex + rotateBy;
                if(nextIndex > arrayLength - 1){
                    nextIndex = nextIndex - arrayLength;
                }

                if(index == nextIndex){
                    break;
                }

                arr[tempIndex] = arr[nextIndex];
                tempIndex = nextIndex;

            }
            arr[tempIndex] = temp;
        }


    }

    public static void main(String[] args) {

        int arr[] = {8,9,10,11,14,15,1,3,4,6};
        int rotateBy = 1;
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotateArray(arr, rotateBy);

        for (int index = 0; index < arr.length; index++){
            System.out.println(arr[index]);
        }

    }

}
