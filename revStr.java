/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimes
 */
public class revStr {
    
    public static void main(String[] v) {
        // Write your code here..
        String str="codnig";
        System.out.print(rev(str,""));
    }
    public static String rev(String str,String ans)
    {
        for(int i=str.length()-1;i>=0;i--)
        {
            ans+=str.charAt(i);
        }
        return ans;
        }

}

