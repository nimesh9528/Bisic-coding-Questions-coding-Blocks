
import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimes
 */
public class DI {
    public static void main(String[] v)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] str=new String[n];
        for(int i=0;i<n;i++)
            str[i]=sc.next();
        Stack<Integer> st=new Stack<>();
        for(String i:str)
            seq(i,st);
    }
    public static void seq(String str,Stack<Integer> st)
    {
       int n=1;
       for(int i=0;i<str.length();i++)
       {
            char ch=str.charAt(i);
            if(ch=='D')
            {
                st.push(n);
                n++;
            }
            else
            {
                st.push(n);
                n++;
                while(st.size()>0)
                {
                    System.out.print(st.pop());
                }
            }
       }
       st.push(n);
       while(st.size()>0)
       {
            System.out.print(st.pop());
        }       
       System.out.println();
    }
}
