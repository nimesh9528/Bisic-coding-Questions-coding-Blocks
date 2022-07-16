/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimes
 */
public class printProgr {
    
    printProgr()
    {
        System.out.println("I love Programming");
    }
    printProgr(String s)
    {
        System.out.println("I love "+s);
    }
    
}
class ansProg
{
    public static void main(String[] v )
    {
        printProgr p1=new printProgr();
        printProgr p2=new printProgr("nimesh");
    }
}