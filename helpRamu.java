
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
public class helpRamu {
    public static void main(String[] v)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int[] arr=new int[4];
            for(int i=0;i<4;i++)
            {
                arr[i]=sc.nextInt();
            }
            int n=sc.nextInt();
            int[] na=new int[n];
            int m=sc.nextInt();
            int[] ma=new int[m];
            for(int i=0;i<n;i++)
            {
                na[i]=sc.nextInt();
            }
            for(int i=0;i<m;i++)
            {
                ma[i]=sc.nextInt();
            }
            System.out.println(find(arr,na,ma));
            t--;
        }
       
    }
     public static int find(int[] arr,int[] n,int[] m)
        {
            int sumn=0,summ=0;
            for(int i=0;i<n.length;i++)
            {
                sumn+=Math.min(n[i]*arr[0],arr[1]);
                
            }
            sumn=Math.min(sumn, arr[2]);
            for(int i=0;i<m.length;i++)
            {
                summ+=Math.min(Math.min(m[i]*arr[0],arr[1]),arr[2]);
            }
             summ=Math.min(summ, arr[2]);
            return Math.min(sumn+summ,arr[3]);
        }
}
