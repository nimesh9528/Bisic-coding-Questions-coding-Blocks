import java.util.*;
public class OddEvenBack {
    public static void main(String[] v)
    {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            check(n);
            
            t--;
        }
    }
    public static void check(int n)
    {
        int sume=0,sumo=0;
        while(n!=0)
        {
            int i=n%10;
            if(i%2==0)
            {
                sume+=i;
                n=n/10;
            }
            else
            {
                sumo+=i;
                n=n/10;
            }
        }
        if(sumo%3==0|| sume%4==0)
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}
