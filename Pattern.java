import java.util.Scanner;

class Pattern{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //HOLLOW RHOMBUS

        //  for(int i=0; i<n;i++){
        //     //1st segment for space
        //     for(int j = i; j < n; j++){
        //         System.out.print("  ");
        //     }

        //     //2nd segment for one star
        //     System.out.print("* ");

        //     //3RD Segment for inner block 3(space+star)
        //     if(i==0 ||i==n-1){
        //         for(int j =0; j< n-2;j++){
        //             System.out.print("* ");
        //         }
        //     }else{
        //         for(int k =0; k< n-2;k++){
        //             System.out.print("  ");
        //         }    
        //     }

        //     //last star
        //     System.out.print("* ");
            
        //     System.out.println();
        // } 

        //dimon
        //1st part
        // for(int i=0; i<n;i++){
        //     //1st segment for space
        //     for(int j = i; j < n; j++){
        //         System.out.print("  ");
        //     }

        //     //for 2nd half
        //     for(int j= n-i;j<=n;j++){
        //         System.out.print("* ");
        //     }

        //     //for 3rd half
        //     for(int j= 1; j<= i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // //2nd part
        // for(int i=0; i<n; i++){
        //     //for space
        //     for(int j=0; j<= i;j++){
        //         System.out.print("  ");
        //     }

        //     //for *
        //     for(int j=i; j<n; j++){
        //         System.out.print("* ");
        //     }

        //     //for *
        //     for(int j=n-1; j>i; j--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //NUMBER PYRAMID
        // for(int i=0; i<n;i++){
        //     //1st segment for space
        //     for(int j = i; j < n-1; j++){
        //         System.out.print("  ");
        //     }

        //     //for 2nd half
        //     for(int j= n-i;j<=n;j++){
        //         System.out.print(i+"  " );
        //     }
        //     System.out.println();
        // }

        //PALINDROMIC Pattern with Numbers
        //  for(int i=0; i<n;i++){
        //     //1st segment for space
        //     for(int j = i; j < n; j++){
        //         System.out.print("  ");
        //     }

        //     //for 2nd half
        //     for(int j= i+1;j>0;j--){
        //         System.out.print(j+" ");
        //     }

        //     //for 3rd half
        //     for(int j= 2; j<= i+1; j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }


        //+ code soumen interview
        for(int i=0; i<n; i++){
            for(int k=0; k<n; k++){
                if(k== n/2 || i== n/2){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
            
    }
}    
       