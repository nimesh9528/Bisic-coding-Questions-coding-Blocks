/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimes
 */
public class printDataType {
    public static void main(String[] v)
    {
        printDataType p1=new printDataType();
        p1.printn(3);
        p1.printn(0);
        p1.printn(true);
        p1.printn(4.33);
        p1.printn(4.468f);
        p1.printn("nimesh");
        p1.printn('a');
        
    }
    void printn(int a)
    {
        System.out.println("int:"+a);
    }
    void printn(char a)
    {
        System.out.println("char:"+a);
    }
    void printn(float a)
    {
        System.out.println("float:"+a);
    }
    void printn(double a)
    {
        System.out.println("double:"+a);
    }
    void printn(String a)
    {
        System.out.println("string:"+a);
    }
    void printn(boolean a)
    {
        System.out.println("boolean:"+a);
    }
}
