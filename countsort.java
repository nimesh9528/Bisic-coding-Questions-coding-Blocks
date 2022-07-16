
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimes
 */
public class countsort {
    public static void main(String[] v)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=1;i<n;i++)
            if(arr[i]<min)
                min=arr[i];
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
//        System.out.print(max);
//        System.out.print(min);
        sort(arr,min,max);
    }
    public static void sort(int[] arr,int min,int max)
    {
        int range=max-min;
        int[] frearr=new int[range+1];
        for(int i=0;i<arr.length;i++)
        {
            frearr[arr[i]-min]++;
        }
        for(int i=1;i<frearr.length;i++)
        {
            frearr[i]=frearr[i]+frearr[i-1];
        }
        int[] ans=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            int pos=arr[i]-min;
            ans[frearr[pos]-1]=arr[i];
            frearr[pos]--;
        }
        for(int i:ans)
            System.out.print(i+" ");
    }
    
}
