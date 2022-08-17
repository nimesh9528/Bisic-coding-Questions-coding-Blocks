/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class ReverseWordsofString {
    public static void main(String[] a){
        String s="Letss do  coding";
        char []arr=new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i);
        }
        int i=0;
        for(int j=0;j<s.length();j++){
            if(arr[j]== ' '){
                reverse(arr,i,j);
                i=j+1;
            }
        }
        if(i!=s.length()-1){
            reverse(arr,i,s.length()-1);
        }
        for(char c:arr){
            System.out.print(c);
        }
    }
    public static void reverse(char[] arr,int i,int j){
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
