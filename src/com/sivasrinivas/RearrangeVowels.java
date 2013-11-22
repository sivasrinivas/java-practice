package code;

import java.util.Arrays;
import java.util.*;


public class RearrangeVowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Character> list = new LinkedList<Character>(Arrays.asList('a','i','m','z','o','n'));
		int length = list.size();
		for(int i=0;i<length;i++){
			char c = list.get(i);
			if("aeiouAEIOU".indexOf(c)!=-1){
				list.remove(i);
				list.add(c);
				length--;
				i--;
			}
		}
		
		System.out.println(list);
	}

}
