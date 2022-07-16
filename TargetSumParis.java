
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimes
 */
public class TargetSumParis {
    public static void main(String[] v)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]  arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        Arrays.sort(arr);
        target(arr,t);
    }
    public static void target(int[] arr,int t)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                sum=arr[i]+arr[j];
                if(sum==t)
                {
                    System.out.println(arr[i]+" and "+arr[j]);
                }
            }
        }
    }
}
