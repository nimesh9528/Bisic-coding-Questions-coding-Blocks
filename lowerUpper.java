import java.util.*;
public class lowerUpper {
    public static void main(String[] v)
    {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        int n=c;
        if(n>64&& n<91)
            System.out.print("UPPERCASE");
        else if(n>96&& n<123)
            System.out.print("lowercase");
        else
            System.out.print("invalid");
            
    }
}
