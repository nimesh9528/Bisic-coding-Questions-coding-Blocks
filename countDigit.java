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
public class countDigit {
    public static void main(String[] v)
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int m=sc.nextInt();
        System.out.print(find(n,m));
    }
    public static int  find(long n,int m)
    {
        int count=0;
        while(n!=0)
        {
            int c=(int)n%10;
            if(c==m)
                count++;
            n=n/10;
        }
        return count;
    }
}
