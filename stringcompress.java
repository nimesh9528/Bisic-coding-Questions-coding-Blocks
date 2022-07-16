/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimes
 */
public class stringcompress {
    public static void main(String[] v)
    {
        String str="aaabbc";
        System.out.print(find(str));
    }
    public static String find(String str)
    {
        String s= str.charAt(0)+"";
        int count=1;
        for(int i=1;i<str.length();i++)
        {
            char ch=str.charAt(i);
            char p=str.charAt(i-1);
            
            if(ch==p)
            {
                count++;
            }
            else
            {
                if(count>1)
                {
                    s+=count;
                    count=1;
                }
                s+=ch;
            }
            
        }
        if(count>1)
                {
                    s+=count;
                }
        return s;
    }
}
