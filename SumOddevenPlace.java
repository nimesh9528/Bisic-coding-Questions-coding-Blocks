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
public class SumOddevenPlace {
    public static void main(String[] v)
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        sum(n,0,0);
    }
    public static void sum(long n,int sumo,int sume)
    {
        int i=1;
        while(n!=0)
        {
            int m=(int)n%10;
            if(i%2==0)
            {
                sume+=m;
            }
            else
                sumo+=m;
            n=n/10;
            i++;
        }
        System.out.print(sumo+"\n"+sume);
    }
}
