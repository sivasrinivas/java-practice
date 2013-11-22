package code;


public class StringCompress {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Compress com = new Compress();
		System.out.println(com.compress("ABC"));
	}

}

class Compress{
	
	public String compress(String str){
		if(str==null){
			System.out.println("Passed null string.");
			return null;
		}
		String comStr = "";
		char prev;
		char cur;
		int length = str.length();
		if(str.length()==0){
			System.out.println("Passed empty string.");
			return "";
		}
		else if(length==1){
			comStr=str.charAt(length-1)+"1";
			return comStr;
		}
		prev = str.charAt(0);
		int count = 0;
		for(int i=0; i<length;i++){
			cur=str.charAt(i);
			if(cur==prev){
				count++;
				prev = cur;
			}
			else{
				comStr=comStr+prev+count;
				prev = cur;
				count=1;
			}
		}
		comStr = comStr+prev+count;
		return comStr;
	}
}