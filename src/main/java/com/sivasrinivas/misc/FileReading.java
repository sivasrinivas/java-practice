package com.sivasrinivas.misc;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileReading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("input.txt");
		try {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			System.out.println(input.readLine());
			BufferedReader br = new BufferedReader(new FileReader(file));
			BufferedWriter bw = new BufferedWriter( new FileWriter(new File("output.txt")));
			String line="";
			while((line=br.readLine())!=null){
				bw.write(line);
				bw.newLine();
			}
			br.close();
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
