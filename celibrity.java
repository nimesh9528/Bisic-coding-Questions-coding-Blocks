
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
public class celibrity {
    public static void main(String [] v)
    {
        Scanner sc=new Scanner(System.in);
        int[][] arr={{0,0,1},{0,0,0},{1,0,0}};
        
    }
    public static void find(int [][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i==j)
                    continue;
                if(arr[i][j]==1)
                    continue;
            }
        }
    }
}
