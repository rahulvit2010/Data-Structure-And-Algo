package com.rahul.ds.practice.setMatrixZero;

public class Solution {

  public static void main(String[] args) {

    int [][] matrix = new int[][]{{1,1,1},{1,0,1},{1,1,1}};

    //Output: [[1,0,1],[0,0,0],[1,0,1]]

    int [][] result= setZeroes(matrix);
    for (int i = 0; i < result.length; i++) { //this equals to the row in our matrix.
      for (int j = 0; j < result[i].length; j++) { //this equals to the column in each row.
        System.out.print(result[i][j] + " ");
      }
      System.out.println(); //change line on console as row comes to end in the matrix.
    }
  }

  public static int[][] setZeroes(int[][] matrix) {
    int row= matrix.length;
    int col= matrix[0].length;
    boolean rowZero=false;
    boolean colZero=false;

    for(int i=0;i<row;i++)
    {
      for(int j=0;j<col;j++)
      {
        if(matrix[i][j]==0)
        {
          if(i==0) rowZero=true;
          if(j==0) colZero=true;
          matrix[i][0]=0;
          matrix[0][j]=0;
        }
      }
    }

    for(int i = 1; i < matrix.length; i++) {
      for(int j = 1; j < matrix[0].length; j++) {
        if(matrix[i][0] == 0 || matrix[0][j] == 0) {
          matrix[i][j] = 0;
        }
      }
    }

    if(rowZero) {
      for(int j = 0; j < matrix[0].length; j++) {
        matrix[0][j] = 0;
      }
    }
    if(colZero) {
      for(int i = 0; i < matrix.length; i++) {
        matrix[i][0] = 0;
      }

    }
    return matrix;
  }

}
