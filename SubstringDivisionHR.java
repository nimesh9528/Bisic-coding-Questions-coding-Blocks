
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimes
 */
public class SubstringDivisionHR {
    public static void main(String[] vb)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(2);
        int m=2;
        int n=3;
        
        System.out.print(as(list,n,m));
    }
    public static int as(ArrayList<Integer> s,int d,int m)
    {
        int count=0;
        for(int i=0;i<s.size()-m;i++)
        {
            int sum=0;
            for(int j=i;j<i+m;j++)
            {
                    sum+=s.get(j);
                    System.out.println(sum);
                    
                
            }
            if(sum==d)
            {
                
                count++;
            }
        }     
        return count;
    }
 }

