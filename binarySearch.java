/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimes
 */
import java.util.*;
public class binarySearch {
    public static void main(String[] v)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int s=sc.nextInt();
        System.out.print(search(arr,s,0,arr.length));
    }
    public static int search(int[] arr,int s,int a,int e)
    {
        
        int mid=(a+e)/2;
        if(arr[mid]==s)
           return mid-1;           
        else if(s<mid)
            return search(arr,s,a,mid-1);
        else if(s>arr[mid])
            return search(arr,s,mid+1,e);
        return -1;
    }
}
