import java.util.*;
public class ShoppingGame {
    public static void main(String[] v)
    {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
         int a, b;
        for(int i=0;i<t;i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            if(a>b)
                System.out.print("Ayush\n");
            else
                System.out.print("Harshit\n");
        }
    }
}
