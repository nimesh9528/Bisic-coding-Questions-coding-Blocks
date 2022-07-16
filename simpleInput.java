import java.util.*;
public class simpleInput {
    public static void main(String[] v)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while(sum>=0)
        {
            int n=sc.nextInt();
            sum+=n;
            if (sum>=0)
                System.out.println(n);
        }
        
    }
}
