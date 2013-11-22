package com.test;


import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Stack;

import com.sivasrinivas.Test;

public class Test2 {

	public Test2( ) {
		
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigDecimal price = new BigDecimal("18.99");
		BigDecimal tax = price.multiply(new BigDecimal(0.1));
		
		System.out.println(price);
		System.out.println(tax);
		System.out.println(price.add(tax));
		
	}
	

}
