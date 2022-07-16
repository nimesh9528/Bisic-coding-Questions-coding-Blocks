import java.util.*;
public class Rec1 {
    public static void main(String[] v)
    {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        rec(n);
        
    }
    public static void rec(int n)
    {
        if(n==0)
           return ;
        
        rec(n-1);
        System.out.println(n);
    }
}
