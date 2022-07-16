import java.util.*;
public class replaceZeros {
    public static void main(String[] v)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=sc.nextInt();
        check(s,c);
        
    }
    public static void check(String s,int c)
    {
        int n=s.length();
        int a=0;
        String str="";
        while(a<n)
        {
            char d=s.charAt(a);
            int i='d'-48;
            if(i==0)
            {
                str+=c;
            }
            else
                str+=i;
            a++;
        }
        if(s.equals(str))
            System.out.print("Zero is not present");
        else
            System.out.print(str);
    }
}
