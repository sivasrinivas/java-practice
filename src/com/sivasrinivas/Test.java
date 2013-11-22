package com.sivasrinivas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Iterator;

public class Test {
	
	
	public static void main(String[] args) {
		
		System.out.println(Integer.parseInt(new StringBuilder(Integer.toBinaryString(10)).reverse().toString(), 2));
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("")));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}	

