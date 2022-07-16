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
public class palin {
    public static void main(String[] v)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        System.out.print(palindrome(n));
        
        
    }
    static boolean palindrome(int n)
    {
        
        String a=n+"";
        String b="";
        int l=a.length();
        for(int i=l-1;i>=0;i--)
        {
            b=b+a.charAt(i);
        }
        if(a.matches(b))
            return true;
        else
            return false;
    }
    
}
