import java.util.*;

class ReverseNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        while(n!=0){
            int i = n % 10;
            rev = (rev * 10 )+ i; 
            n/=10;
        }
            System.out.print(rev);
    }
}