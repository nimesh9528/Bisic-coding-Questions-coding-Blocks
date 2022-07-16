
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
public class StringComp {
    public static void main(String[] v)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        comp(str);
    }
    public static void comp(String str)
    {
        int i=0;
        while(str.charAt(i)>='a'|| str.charAt(i)<='z')
        {
            char ch=str.charAt(i);
            int count=1,j=i+1;
            while(str.charAt(j)==ch)
            {
                count++;
                j++;
            }
            System.out.print(ch+count);
            i=j;
        }
    }
}
