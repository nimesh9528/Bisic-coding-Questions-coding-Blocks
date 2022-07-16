import java.util.*;
public class cbNumber {
    public static void main(String[] v)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.nextLine();
        for(int i=1;i<=str.length();i++)
        {
            for(int j=0;j<=str.length()-i;j++)
            {
                int e=j+i;
                String a=str.substring(i, e);
                System.out.println(a);
            }
        }
    }
}
