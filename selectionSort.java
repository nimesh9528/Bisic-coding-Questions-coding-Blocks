
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
public class selectionSort {
    public static void main(String[] v)
    {
        int [] arr={33,2,55,6,24,77,13};
        selection(arr);
        System.out.print(Arrays.toString(arr));
    }
    public static void selection(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int counter=i;
            for(int j=counter+1;j<arr.length;j++)
            {
                if(arr[counter]>arr[j])
                {
                    counter =j;
                }
            }
            int temp=arr[counter];
            arr[counter]=arr[i];
            arr[i]=temp;
        }
    }
}
