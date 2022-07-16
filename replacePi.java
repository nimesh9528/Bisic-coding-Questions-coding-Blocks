import java.util.*;
public class replacePi {
    public static void main(String[] v)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>=0)
        {
            String a=sc.nextLine();
            System.out.print(a.replaceAll("pi","3.14")+"\n");
            n--;
        }
    }
    
}
