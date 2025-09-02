package com.myjava;

public class MatrixOperation{
     public static boolean findElement(int[][] arr,int key){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++ ){
                if(arr[i][j] == key){
                    System.out.println("key index is:["+i+","+j+"]");
                    return true;
                }    
            }
        }
        System.out.println("element not present");
        return false;
    }

    public static int maxMinNumber(int[][] arr){
        int maxNum = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] > maxNum){
                    maxNum = arr[i][j];
                    
                }
            }
        }

        return maxNum;
    }
    
    public static int minNumber(int[][] arr){
        int minNum = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                 if(arr[i][j] < minNum){
                    minNum = arr[i][j];
                }
            }
        }

       return minNum;
    }

    public static void spiralMatrix(int[][] arr){
        int n = arr.length - 1;
        //initialization
        int startRow = 0;
        int endRow = n;
        int startCol = 0;
        int endCol = n;

        //spiral print
        while(startRow <= endRow && startCol <= endCol){
            //top
            for(int col=0; col<=endCol; col++){
                System.out.print(arr[startRow][col] + " ");
            }
            //right
            for(int row=startRow+1; row<=endRow;row++){
                 System.out.print(arr[row][endCol] + " ");
            }
            //bottom
            for(int col=endCol-1; col>=startCol;col--){
                if(startRow == endRow){
                    break;
                }    
                 System.out.print(arr[endRow][col] + " ");
            }
            //left
            for(int row=endRow-1; row>=startRow+1;row--){
                if(startCol == endCol){
                    break;
                }    
                 System.out.print(arr[row][startCol] + " ");
            }

            //update
            startCol++;
            endCol--;
            startRow++;
            endRow--;
        }
        System.out.println(" ");

    }

    public static int diagonalSum(int[][] arr){
        int n = arr.length;
        int sum = 0;
        // for(int i =0; i<n; i++){
        //     for(int j=0; j<arr[0].length; j++){
        //         if(i==j){
        //             sum += arr[i][j];
        //         }
        //         else if(i+j == n-1){
        //             sum += arr[i][j];
        //         }
        //     }
        // }

      //optimize code 
        for(int i=0; i<n;i++){
            //primary diagonal sum
            sum += arr[i][i];

            //secondary diagonal sum
            if(i != n-1-i){
                sum += arr[i][n-1-i];
            }

        }  
        return sum;
    }

    public static void stairCaseSearch(int[][] arr, int key){
       int n = arr.length;
       int row = 0;
       int col = n - 1;  // start at top-right corner

        while (row < n && col >= 0) {
            if (arr[row][col] == key) {
                System.out.println("Key found at index: " + row + "," + col);
                break;
            }
            else if (key < arr[row][col]) {
                col--; // move left
            }
            else {
                row++; // move down
            }
        }
 
    }
}