package com.sivasrinivas.misc;

import java.text.DecimalFormat;

public class Sqrt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new DecimalFormat("0.0").format(sqrt(9)));
	}
	
	public static double sqrt(double value){
		return sqrtUtil(value, 0, value);
	}
	
	public static double sqrtUtil(double value, double low, double high){
		if(low>high)
			return 0;
		
		double mid = low+(high-low)/2;
		double s = mid*mid;
		if(Math.abs(s - value)<0.0000000000001)
			return mid;
		else if(s - value >0){
			return sqrtUtil(value, low, mid);
		}else{
			return sqrtUtil(value, mid, high);
		}
	}

}
