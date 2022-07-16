import java.util.*;
public class rec2 {
    public static void main(String[] v)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=1;
        System.out.print(rec(n,sum));
    }
    public static int rec(int n,int s)
    {
        if(n==0||n==1)
        {
            return s;
        }
        s*=n;
        return rec(n-1,s);
        
  }
    
}
