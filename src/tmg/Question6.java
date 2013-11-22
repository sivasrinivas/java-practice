package tmg;

import java.util.Random;


public class Question6 {
	
	public static void main(String[] args) {
		Random rand = new Random();
		
//		for (int i = 0; i < 10; i++) {
			int value = 40982;//rand.nextInt(999112340);
			String s = numToString(value);
			System.out.println(value + ": " + s);
//		}
	}
	//I am considering maximum range 999 millions within the range of int
	public static String numToString(int num) {
		StringBuilder sb = new StringBuilder();
		
		// Count number of digits in num.
		int len = 1;
		while (Math.pow((double)10, (double)len ) < num) {
			len++;
		}

		String[] wordarr1 = {"","One ", "Two ", "Three ", "Four ", 
							"Five ", "Six ", "Seven ", "Eight ","Nine "};
		String[] wordarr11 ={"", "Eleven ", "Twelve ", "Thirteen ", 
							"Fourteen ", "Fifteen ", "Sixteen ", 
							"Seventeen ", "Eighteen ", "Nineteen "};
		String[] wordarr10 = {"","Ten ", "Twenty ", "Thirty ", "Forty ", 
							"Fifty ", "Sixty ", "Seventy ", "Eighty ", 
								  "Ninety "};
		String[] wordarr100 = {"", "Hundred ", "Thousand ", "Million ", "Billion "};
		int tmp;

		if (num == 0) {
			sb.append("Zero");
		} else {
			int factor = 1;
			do {
				// Number greater than 999
				if (len > 3) {
					tmp = (num / (int)Math.pow((double)10,(double)(3*factor)));
					System.out.println(tmp);
					if(tmp/100>=1){
						sb.append(wordarr1[tmp/100]);
						sb.append(wordarr100[1]);
						tmp=tmp%100;
					}
					// If tmp is 2 digit number and not a multiple of 10
					if (tmp / 10 == 1 && tmp%10 != 0) {
						sb.append(wordarr11[tmp % 10]) ;
					} else {
						sb.append(wordarr10[tmp / 10]);
						sb.append(wordarr1[tmp % 10]);
					}
					if (len > 6) {
						sb.append(wordarr100[3]);
					}else{
						sb.append(wordarr100[2]);
					}
					num = num % (int)(Math.pow((double)10,(double)len-3*factor));
					len = len-3*factor;
					factor++;

				} else { // Number is less than 1000
					tmp = num / 100;
					if (tmp != 0) {
						sb.append(wordarr1[tmp]);
						sb.append(wordarr100[len / 2]);
					}
					tmp = num % 100 ;
					if(tmp / 10 == 1 && tmp % 10 != 0) {
						sb.append(wordarr11[tmp % 10]) ;
					} else {
						sb.append(wordarr10[tmp / 10]);
						sb.append(wordarr1[tmp % 10]);
					}
					len = 0;
				}
			} while(len > 0);
		}
		return sb.toString();
	}
	
	
}
