/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimes
 */
public class tawas_and_Saddas {
    public static void main(String[] c)
    {
        String str="7474";
        System.out.print(Tawas(str));
    }
    public static int Tawas(String str)
    {
        int d=str.length();
        int num=(1<<d) -2;
        int pos=0;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)=='7')
            {
                num=num+(1<<pos);
            }
            pos++;
        }
            return num+1;
    }
}
