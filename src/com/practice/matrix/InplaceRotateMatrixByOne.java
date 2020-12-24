package com.practice.matrix;

public class InplaceRotateMatrixByOne {

    public static void rotateMatrix(int[][] mat){

        int rowCount = mat.length;
        int colCount = mat[0].length;

        int rowStart = 0, colStart = 0, rowEnd = rowCount, colEnd = colCount;

        while(rowStart < rowEnd && colStart < colEnd){

            int prevValue = mat[rowStart + 1][colStart];

            //Top Row
            for(int i = colStart; i < colEnd; i++){
                int temp = mat[rowStart][i];
                mat[rowStart][i] = prevValue;
                prevValue = temp;
            }
            rowStart++;

            //RightColumn
            for(int i = rowStart; i < rowEnd; i++){
                int temp = mat[i][colEnd - 1];
                mat[i][colEnd - 1] = prevValue;
                prevValue = temp;
            }
            colEnd--;

            //Bottom Row
            if(rowStart < rowEnd) {
                for (int i = colEnd - 1; i >= colStart; i--) {
                    int temp = mat[rowEnd - 1][i];
                    mat[rowEnd - 1][i] = prevValue;
                    prevValue = temp;
                }
                rowEnd--;
            }

            //Left Column
            if(colStart < colEnd) {
                for (int i = rowEnd - 1; i >= rowStart; i--) {
                    int temp = mat[i][colStart];
                    mat[i][colStart] = prevValue;
                    prevValue = temp;
                }
                colStart++;
            }
        }


    }

    public static void printMatrix(int[][] mat){

        int rowCount = mat.length;
        int colCount = mat[0].length;

        for(int i = 0; i< rowCount; i++){
            System.out.println();
            for(int j = 0; j < colCount; j++){
                System.out.print(" " + mat[i][j]);
            }
        }

    }

    public static void main(String[] args) {

        int mat[][] = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20}
        };
        rotateMatrix(mat);
        printMatrix(mat);
    }
}
