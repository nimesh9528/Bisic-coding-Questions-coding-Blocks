
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
public class productExceptSelf {
    public static void main(String[] v)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long[] arr= new long[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextLong();
        long pro=1;
        for(int i=0;i<n;i++)
        {
            pro*=arr[i];
        }
        for(int i=0;i<n;i++)
            System.out.print(pro/arr[i]+" ");
    }
}
