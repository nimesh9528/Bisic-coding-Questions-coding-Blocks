
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
public class removeDupStr {
    public static void main(String[] v)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        rem(str);
    }
    public static void rem(String str)
    {
        int len=str.length();
        int i=0;
        while(i<len)
        {
            char ch= str.charAt(i);
            if(i==len-1)
            {
                System.out.print(ch);
                i++;
            }
            else if(ch==str.charAt(i+1))
                i++;
            else
            {
                System.out.print(ch);
                i++;
            }
            
        }
    }
}
