
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
public class bubbleSort {
    public static void main(String[] v)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextLong();
        } 
        sort(arr,n);
        for(long i:arr)
            System.out.println(i);
    }
    public static long[] sort(long[] arr,int n)
    {
        for(int i=0;i<n;i++)
        {            
            for(int j=0;j<n-i-1;j++)
            {
             if(arr[j]>arr[j+1])
                {
                 long temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    
}
