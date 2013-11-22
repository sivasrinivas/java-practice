package tmg;

public class Question2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//input is a string specifying ticket range

		System.out.println(countLuckyTickets(0, 999999));
	}
	
	public static int countLuckyTickets(int rangeStart, int rangeEnd){
		int count=0;
		for(int i=rangeStart; i<=rangeEnd; i++){
			String strRep = getStringForm(i);
			if(isLucky(strRep))
				count++;
		}
			
		return count;
	}
	
	private static boolean isLucky(String ticket){
		if(ticket==null)
			return false;
		int length=ticket.length();
		if(length==0 || length>6)
			throw new IllegalArgumentException("Ticket number range exceeded.");
		
		char[] chars = ticket.toCharArray();
		
		int firstPart=0;
		int lastPart=0;
		
		length--;
		while(length>2){
			lastPart+=chars[length];
			length--;
		}
		
		while(length>=0){
			firstPart+=chars[length];
			length--;
		}
		if(firstPart==lastPart)
			return true;
		return false;
	}

	public static String getStringForm(int i){
		if(i<0 || i>999999)
			throw new IllegalArgumentException("Ticket number range exceeded.");
		
		StringBuilder sb = new StringBuilder();
		if(i>=100000){
			
		}
		else if(i>=10000){
			sb.append("0");
		}
		else if(i>=1000){
			sb.append("00");
		}
		else if(i>=100)
			sb.append("000");
		else if(i>=10)
			sb.append("0000");
		else
			sb.append("00000");
			
			sb.append(String.valueOf(i));
		return sb.toString();
	}
}
