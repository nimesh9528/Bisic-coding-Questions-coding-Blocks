import java.util.*;
public class maxSubsum {
    public static void main(String[] v)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print(sum(n,arr));
    }
    public static int sum(int n,int[] arr)
    {
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
                ans=Math.max(ans, sum);
            }
        }
        return ans;
                
    }
}
