import java.util.*;
public class StringOddEvenChar {
    public static void main(String[] v)
    {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder b=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
           if(i%2==0)
            {
                char a=s.charAt(i);
                int n=(int)a;
                char c=(char)(n+1);
                b.append(c);
            }
            else
            {
                char a=s.charAt(i);
                int n=(int)a;                
                char c=(char)(n-1);
                b.append(c);
            }
            
        }
        System.out.print(b);
    }
}
