//Check if a given string can be formed using characters of adjacent cells of a Matrix
//Idea is to traverse the matrix to find the first charcater and then look for adjacent horizontal and vertical in recursive manner
package com.practice.matrix;

public class StringFormAdjacentCellMatrix {

    public static boolean findStringInMatrix(char mat[][], String word, int index, int row, int col, int rowCount, int colCount){

        if( row < 0 || col < 0 || row >= rowCount || col >= colCount){
            return false;
        }

        if(mat[row][col] != word.charAt(index)){
            return false;
        }

        if(index == word.length() - 1){
            return true;
        }

        char temp = mat[row][col];

        mat[row][col ] = '*';

        if(findStringInMatrix(mat, word, index + 1, row + 1, col, rowCount, colCount) ||
                findStringInMatrix(mat, word, index + 1, row - 1, col, rowCount, colCount) ||
                findStringInMatrix(mat, word, index + 1, row, col + 1, rowCount, colCount) ||
                findStringInMatrix(mat, word, index + 1, row, col - 1, rowCount, colCount)
                ){
            mat[row][col] = temp;
            return true;
        }
        mat[row][col] = temp;
        return false;

    }

    public static void main(String[] args) {

        char mat[][] = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}
        };

        String word = "SEEDF";

        int rowCount = mat.length;
        int colCount = mat[0].length;

        for(int i = 0; i < rowCount; i++){
            for(int j = 0; j < colCount; j++){
                if(mat[i][j] == word.charAt(0) && findStringInMatrix(mat, word,0, i, j, rowCount, colCount)){
                    System.out.println(true);
                    return;
                }
            }
        }

        System.out.println(false);

    }
}
