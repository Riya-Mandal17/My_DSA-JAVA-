import com.myjava.StringOperation;
import java.util.Scanner;

public class StringChapter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter your string:");
        str = sc.nextLine();

        StringOperation so = new StringOperation();
        System.out.println(so.isPlindrom(str));
        
    }
}