

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimes
 */
public class BinaryTO_decimal {
    public static void main(String[] v)
    {
        int [] ar={101,1001,10010};
        for(int i=0;i<ar.length;i++)
        {
            int a=decimal(ar[i]);
            System.out.println(a);
        }
    }
    public static int decimal(int a)
    {
        int i=0,s=0,n,j;
        while(a!=0)
        {
            j=a%10;
            n=j*CalculatePower(2,i);
            s+=n;
            a/=10;
            i++;
        }
        return s;
    }
    static int CalculatePower (int num, int pow){
        if (pow == 0)
            return 1;
        else
            return num * CalculatePower(num, pow - 1);
    }
}
