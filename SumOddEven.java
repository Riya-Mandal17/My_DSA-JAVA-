import java.util.Scanner;

class SumOddEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumOdd = 0;
        int sumEven = 0;
        for(int i =1; i<=n; i++){
            if(i % 2 == 0){
                sumEven += i;
            }
            else{
                sumOdd += i;
            }
           
        }
        System.out.println("Even sum:"+sumEven);
        System.out.println("Odd sum:"+sumOdd);
    }
}
   