
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
public class printSpiral {
    public static void main(String[] v)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m=sc.nextInt();
        int [][] arr=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        //Aclockwise(arr);
        clockwise(arr);
    }
    public static void Aclockwise(int[][]arr)
    {
        int minr=0;
        int maxr=arr.length-1;
        int minc=0;
        int maxc=arr[0].length-1;
        int count=0;
        int total=arr.length*arr[0].length;
        while(count<total)
        {
            for(int r=minr;r<=maxr && count<total;r++)
            {
                System.out.print(arr[r][minc]+", ");
                count++;
            }
            minc++;
            for(int c=minc;c<=maxc && count<total;c++)
            {
                System.out.print(arr[maxr][c]+", ");
                count++;
            }
            maxr--;
            for(int r=maxr;r>=minr && count<total;r--)
            {
                System.out.print(arr[r][maxc]+", ");
                count++;
            }
            maxc--;
            for(int c=maxc;c>=minc&& count<total;c--)
            {
                System.out.print(arr[minr][c]+", ");
                count++;
            }
            minr++;
        }
    }
    public static void clockwise(int[][] arr)
    {
         int minr=0;
        int maxr=arr.length-1;
        int minc=0;
        int maxc=arr[0].length-1;
        int count=0;
        int total=arr.length*arr[0].length;
        while(count<total)
        {
            for(int c=minc;c<=maxc && count<total ;c++)
            {
                System.out.print(arr[minr][c]+", ");
                count++;
            }
            minr++;
            for(int r=minr;r<=maxr&& count<total;r++)
            {
                System.out.print(arr[r][maxc]+", ");
                count++;
            }
            maxc--;
            for(int c=maxc;c>=minc&& count<total;c--)
            {
                System.out.print(arr[maxr][c]+", ");
                count++;
            }
            maxr--;
            for(int r=maxr;r>=minr&& count<total;r--)
            {
                System.out.print(arr[r][minc]+", ");
                count++;
            }
            minc++;
            
        }
        System.out.print("END");
    }
}
