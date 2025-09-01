import com.myjava.MatrixOperation;
import java.util.Scanner;

class Matrix{
    public static void main(String[] args){
        System.out.println("Enter your row & colume number:");
        int n,m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt(); 
        int[][] matrix = new int[n][m];

        //take input element
        System.out.println("Enter matrix elements:");
        for(int i =0 ; i< matrix.length; i++){
            for(int j=0; j< matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //print matrix
        for(int[] x1 : matrix){
            for(int y1 : x1){
                System.out.print(y1 +"  ");
            }
            System.out.println();
        }
        MatrixOperation mat = new MatrixOperation();

    //find key element
        // System.out.println("Enter your key element that you want to search: ");
        // int key = sc.nextInt();
        // mat.findElement(matrix,key);

    //find max num
        // int res = mat.maxMinNumber(matrix);
        // System.out.println("The max num is:" +res);

    //find min num
        // int res = mat.minNumber(matrix);
        // System.out.println("The m nin um is:" +res);

    //spiral matrix
        mat.spiralMatrix(matrix);    

    }
}    