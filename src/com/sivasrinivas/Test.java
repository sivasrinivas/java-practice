package com.sivasrinivas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		System.out.println(Integer.toBinaryString(432));;
		
	}
	
	public static double sqrt(double n, double l, double r){
		
		while(l<=r){
			double m = l+(r-l)/2;
			if(Math.abs(m*m -n ) <= 0.001)
				return m;
			if(m*m<n){
				l=m;
			}else
				r=m;
		}
		
		return 0.0;
	}
	
	
}
