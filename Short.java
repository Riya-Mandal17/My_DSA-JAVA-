import com.soumen.Shortpackage;
import java.util.Scanner;

class Short{
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
        // Shortpackage.bubble(arr);
        // Shortpackage.selectionShort(arr);
        Shortpackage.insertionShort(arr);

        //print array
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}