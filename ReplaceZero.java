import java.util.*;
public class ReplaceZero {
    public static void main(String[] v)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            replace(a);
        }
    }
    public static void replace(int n)
    {
        int sum=0;
        int a=1;
        while(n!=0)
        {
            int i=n%10;
            if(i==0)
                sum+=5*a;
            else
                sum+=i*a;
            a*=10;
            n=n/10;
        }
        System.out.println(sum);
    }
}
