import java.util.Scanner;

class MethodAvarage {
//  public static boolean isEven(int num){
//     if(num %2 == 0){
//         System.out.println("Even");
//         return true;
//     }
//     else{
//         System.out.println("Odd");
//         return false ;
//     }
//     }
static int SumNumber(int num){
    int sumNum =0;
    while(num>0){
        int rNum = num % 10;
        sumNum += rNum;
        num = num/10;
    }
    return sumNum;
}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int m = sc.nextInt();
        // int o = sc.nextInt();
        // Avarage t = new Avarage();
        System.out.println(SumNumber(n));
        // System.out.println("Number is:" + a);
    }
}



