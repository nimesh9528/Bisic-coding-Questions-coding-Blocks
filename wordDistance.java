
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class wordDistance {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr =new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        String val1=sc.next();
        String val2=sc.next();
        List<Integer> list=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i].equals(val1))list.add(i);
            else if(arr[i].equals(val2))ll.add(i);
        }
        System.out.println(list);
        int ans=Integer.MAX_VALUE;
        int j=0,k=0;
        while(j<list.size()){
            while(k<ll.size()){
                ans=Math.min(ans,Math.abs(list.get(j)-ll.get(k)));
                k++;
            }
            j++;
        }
        System.out.print(ans);
        
    }
}
