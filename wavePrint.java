
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimes
 */
public class wavePrint {
    public static void main(String[] v)
    {
        Scanner sc=new Scanner(System.in);
        int [][] arr=new int[3][3];
        int n=3,m=3;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        column(arr,n,m);
        //row(arr,n,m);
    }
    public static void column(int [][] arr,int n,int m)
    {
        for(int col=0;col<n;col++)
        {
            if(col %2==0){
                for(int row=0;row<m;row++)
                {
                    System.out.print(arr[row][col]+" ");
                }
                System.out.println();}
            else
            {
                for(int row=m-1;row>=0;row--)
                {
                    System.out.print(arr[row][col]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void row(int [][] arr,int n,int m)
    {
        for(int i=0;i<n;i++)
        {
            if(i%2==0){
                for(int j=0;j<m;j++)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();}
            else
            {
                for(int j=m-1;j>=0;j--)
                {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
