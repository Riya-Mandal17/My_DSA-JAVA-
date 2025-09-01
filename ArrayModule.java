import com.soumen.BinarySearch;
import java.util.Scanner;

class ArrayModule{
    //  static void ArrayPair(int[] arr){
    //     int maxSum = Integer.MIN_VALUE; 
    //     int sumArray;
    //     int length = arr.length;
    //     for(int i=0; i< length-1;i++){
    //         for(int j= i+1; j<length;j++){
    //             // System.out.println(arr[i]+","+arr[j]);
    //             sumArray= arr[i]+arr[j];
    //             if(maxSum < sumArray){
    //                 maxSum = sumArray;
    //             }
    //         }
    //     }
    //             System.out.println("MAX SUM:"+maxSum);
    // }

    // static void PrefixSum(int[] arr){
    //     // int maxSum = Integer.MIN_VALUE; 
    //     int sumArray =0 ;
    //     int length = arr.length;
    //     int[] prefixArray = new int[5];
    //     for(int i=0; i< length;i++){
    //        sumArray += arr[i];
    //        prefixArray[i] = sumArray;
    //     }
    //     for(int x1 : prefixArray)
    //             System.out.println(x1);
    // }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // array input
        System.out.println("Enter elements of array:");
        for(int x =0; x<n;x++){
            arr[x] = sc.nextInt();
        }

        // System.out.println("Enter key element:");
        // int key = sc.nextInt();

        //for array print
        // for(int x1:arr){                
        //     System.out.println(x1);
        // }
        // PrefixSum(arr);

        // int result = BinarySearch.searchElement(arr,key);
        // BinarySearch.reverseArray(arr);
        // BinarySearch.pairsArray(arr);
        // BinarySearch.subArray(arr);
        // BinarySearch.KadansAlgo(arr);
        //  int result = BinarySearch.prefixSum(arr);
        // if( result == -1)
        //     System.out.println("element not found"); 
        // else       
             // System.out.println("The result is  :" +result);
        // System.out.println("The maximum sum of sub array is :" +result);  

        // int result = BinarySearch.RainTappedWater(arr); 
        // System.out.println("The total trapped water is :" +result);  

        int result = BinarySearch.StockProfit(arr); 
        System.out.println("The maximum profit is :" +result);  

        //for print reverse array   
        // for(int x1:arr){                
        // System.out.print(x1+" ");
        // }
    }
}