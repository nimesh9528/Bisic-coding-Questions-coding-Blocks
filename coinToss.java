import java.util.*;
public class coinToss {
    public static void main(String[] v)
    {
        int n=3;
        coin(n,"");
    }
    public static void coin(int n,String ans)
    {
        int count=0;
        if(n==0)
        {
            System.out.println(ans);
            return;
        }
        coin(n-1,ans+"T");
        coin(n-1,ans+"H");
    }
}

