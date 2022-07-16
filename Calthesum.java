/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimes
 */
import static java.lang.Math.pow;
import java.util.*;
public class Calthesum {
    public static void main(String[] v)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int[] xa=new int[x];
        for(int i=0;i<x;i++){
            xa[i]=sc.nextInt();
        }
        System.out.print(sum(ar,xa));
    }
    public static int sum(int[] ar,int[] xa)
    {
       int sum=0;
       for(int i=0;i<xa.length;i++)
       {
           for(int j=0;j<ar.length;j++)
           {
               if(j-ar[i]<0)
               {
                   ar[j]=ar[j]+ar[(ar.length-1)-(xa[i]-1)];
               }
               else
                {
                   ar[j]=ar[j]+ar[j-xa[i]];
                }
           }           
       }
       for(int i:ar)
       {
           sum+=i;
       }
       double a=Math.pow(10,9)+7;
       return sum%(int)a;
    }
}
