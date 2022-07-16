
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class searchElementUsingRecursion {
    public static void main(String[] v)
    {
        Scanner sc =new Scanner(System.in);
        int[] arr={2,5,7,9,4,5,6,7};
        int n=sc.nextInt();
        searchEle(arr,0,n,0);
        
    }
    public static void searchEle(int[] a,int i,int item,int c)
    {
      
        if(i==a.length)
        {
            return ;
        }
        if(a[i]==item){
        System.out.print(i+1+" ");
        c++;
        }   
        if(i==a.length-1 && a[i]!=item && c==0)
            System.out.print("Element not found");
        searchEle(a,i+1,item,c);
        
    }
}
