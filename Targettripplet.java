
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
public class Targettripplet {
    public static void main(String[] v)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        int sum=0;
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    sum=arr[i]+arr[j]+arr[k];
                    if(i<=j&& j<=k &&sum==tar)
                        System.out.println(arr[i]+","+arr[j]+"and"+arr[k]);
                }
            }
        }
    }
    
        
}
