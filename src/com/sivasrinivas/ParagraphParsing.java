package code;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ParagraphParsing {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		int lineCount=0;
		int charCount=0;
		int wordCount=0;
		char ch;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//file reader
		File file = new File("sample.txt"); 
		BufferedReader fr = new BufferedReader(new FileReader(file));
		System.out.println(fr.readLine());
		
		String line = br.readLine();
		while(line!=null && !line.equals("")){
			System.out.println("raed line: "+line);
			lineCount++;
			for(int i=0; i<line.length(); i++){
				ch=line.charAt(i);
				charCount++;
				if(ch==' ')
					wordCount++;
			}
			wordCount++;
			line = br.readLine();
		}
		System.out.println("Line count: "+lineCount);
		System.out.println("word count: "+wordCount);
		System.out.println("char count: "+charCount);
	}

}
