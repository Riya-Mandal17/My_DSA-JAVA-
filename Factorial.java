import java.util.Scanner;

class Factorial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int facto = 1;
        
        for(int i =2; i<=n; i++){
            facto *= i;
           
        }
        System.out.println(facto);
    }
}
   