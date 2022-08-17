
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class jumpingGame {
    public static void main(String[] av){
        int n=11;
        int no=10;
        int count=1;
        List<Integer> l= new ArrayList<>();
        l.add(0);
        l.add(1);
        int i=1;
        while(i!=no){
            int a=0,b=0;
            if(i-1>=0){
                a=l.get(i-1);
            }
            if(i-2>=0){
                b=l.get(i-2);
            }
            
            int ans=a+b;
            i=i+ans;
            if(i>no){
                l.add(0);
                l.add(1);
                i=i-1;
                count++;
            }
            if(i==no){
                count++;
                break;
            }
            count++;
        }
            System.out.print(count);
    }
}
