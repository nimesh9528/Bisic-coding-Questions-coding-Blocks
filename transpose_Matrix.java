
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimes
 */
public class transpose_Matrix {
    public static void main(String[] v)
    {
        int[][]arr={{1,2,3},{4,5,6},{7,8,9}};
        int [][] a=transpose(arr);
        for(int r=0;r<arr.length;r++)
        {
            for(int c=0;c<arr[0].length;c++)
            {
                System.out.print(a[r][c]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int [][] arr)
    {
        int[][] ar=new int[arr.length][arr[0].length];
        for(int c=0;c<arr[0].length;c++)
        {
            for(int r=0;r<arr.length;r++)
            {
                ar[c][r]=arr[r][c];
            }
        }
        return ar;
    }
}
