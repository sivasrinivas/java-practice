package com.sivasrinivas.dynamic;


public class LongestCommon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "afsdgfhklj";
		String str2 = "bsdgf";
		subString(str1, str2);
	}

	public static void subString(String s, String t){
		int slength = s.length();
		int tlength = t.length();
		int[][] a = new int[slength][tlength];
		
		String sub = "";
		int max=0;
		int lastBegin = 0;
		int thisBegin = 0;
		for(int i=0; i<slength; i++){
			for(int j=0; j<tlength; j++){
				if(s.charAt(i)==t.charAt(j)){
					if(i==0 || j==0){
						a[i][j]=1;
					}
					else{
						a[i][j]=a[i-1][j-1]+1;
					}
					if(a[i][j]>max){
						max=a[i][j];
						thisBegin = i-max+1;
						if(thisBegin==lastBegin){
							sub=sub+s.charAt(i);
						}
						else{
							lastBegin = thisBegin;
							sub=s.substring(lastBegin, i+1);
						}
					}
				}
				else
					a[i][j]=0;
			}
		}
		
		System.out.println(sub);
	}
}

class LCS {

    public static void main(String[] args) {
        String x = "sivasrinivas";
        String y = "siva";
        int M = x.length();
        int N = y.length();

        // opt[i][j] = length of LCS of x[i..M] and y[j..N]
        int[][] opt = new int[M+1][N+1];

        // compute length of LCS and all subproblems via dynamic programming
        for (int i = M-1; i >= 0; i--) {
            for (int j = N-1; j >= 0; j--) {
                if (x.charAt(i) == y.charAt(j))
                    opt[i][j] = opt[i+1][j+1] + 1;
                else 
                    opt[i][j] = Math.max(opt[i+1][j], opt[i][j+1]);
            }
        }

        // recover LCS itself and print it to standard output
        int i = 0, j = 0;
        while(i < M && j < N) {
            if (x.charAt(i) == y.charAt(j)) {
                System.out.print(x.charAt(i));
                i++;
                j++;
            }
            else if (opt[i+1][j] >= opt[i][j+1]) i++;
            else                                 j++;
        }
        System.out.println();

    }

}
