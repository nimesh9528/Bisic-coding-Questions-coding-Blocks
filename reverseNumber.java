import java.util.*;
public class reverseNumber {
    public static void main(String[] v)
    {
        int n = 32145;
int palce =1;
int num=0;
while(n!=0) {
int rem = n%10;
num = (int) (num + palce*Math.pow(10, rem-1));
n/=10;
palce++;
}
System.out.println(num);
}
    
}
