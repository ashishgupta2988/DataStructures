package com.practice.array.rearrangement;

public class RearrangePositiveNegative {

    private void rearrangePositiveNegativeAlternate(int arr[]){

        int posIndex = -1, temp;
        for(int index = 0; index < arr.length; index++){
            if(arr[index] < 0){
                posIndex++;
                temp = arr[index];
                arr[index] = arr[posIndex];
                arr[posIndex] = temp;
            }
        }
        posIndex = posIndex + 1;

    }

    public static void main(String[] args) {

        int arr[] = {8,9,10,11,14,15,1,3,4,6};
        RearrangePositiveNegative rearrangePositiveNegative = new RearrangePositiveNegative();

    }
}
