import java.util.*;
public class ChewbeccaNo {
    public static void main(String[] v)
    {
        Scanner sc =new Scanner(System.in);
        long n=sc.nextLong();
        long ans=(chewbecca(n));
        System.out.print(ans);
    }
    public static long chewbecca(long n)
    {
        long sum=0;
        long a=1;
        while(n!=0&&n!=9)
        {
            
            long i=n%10;
            long j=9-i;
            if(j<=i)
                sum+=j*a;
            else
                sum+=i*a;
            n=n/10;
            a=a*10;
        }
        if(n==9)
            sum+=9*a;
        
        return sum;
    }
}
