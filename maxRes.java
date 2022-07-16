/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nimes
 */
import java.util.*;
public class maxRes {
  
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int divident=36;
		int divisor=60;
		while(divident%divisor!=0) {
			int rem = divident%divisor;
			divident=divisor;
			divisor=rem;
			
			
		}
		System.out.println(divisor);

	}

}

