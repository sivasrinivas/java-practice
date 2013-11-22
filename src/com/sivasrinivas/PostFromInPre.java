package com.sivasrinivas;

public class PostFromInPre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] in = {4, 2, 5, 1, 3, 6};
		int[] post = {4, 5, 2, 6, 3, 1};
		
		
		int[] pre = {1, 2, 4, 5, 3, 6};
//		printPost(in,pre);
		printPre(in, post);
	}
	
	public static void printPost(int[] in, int[] pre){
		if(in==null || pre==null)
			return;
		if(in.length!=pre.length)
			return;
		int length = in.length;
		
		printPostUtil(in, 0, in.length-1, pre, 0, pre.length-1);
	}
	
	private static void printPostUtil(int[] in, int inStart, int inEnd, int[] pre, int preStart, int preEnd){
		if(preStart>preEnd)
			return;
		int rootPos = searchForRoot(in, inStart, inEnd, pre[preStart]);
		int offset = rootPos-inStart;
		printPostUtil(in, inStart, inStart+offset-1, pre, preStart+1, preStart+offset);
		printPostUtil(in, inStart+offset+1, inEnd, pre, preStart+offset+1, preEnd);
		System.out.print(in[rootPos]+", ");
	}
	
	public static void printPre(int[] in, int[] post){
		if(in==null || post==null)
			return;
		if(in.length!=post.length)
			return;
		int length = in.length;
		
		printPreUtil(in, 0, in.length-1, post, 0, post.length-1);
	}
	
	private static void printPreUtil(int[] in, int inStart, int inEnd, int[] post, int postStart, int postEnd){
		if(postEnd<postStart)
			return;
		int rootPos = searchForRoot(in, inStart, inEnd, post[postEnd]);
		int offset = rootPos-inStart;
		System.out.print(in[rootPos]+", ");
		printPostUtil(in, inStart, inStart+offset-1, post, postStart, postStart+offset-1);
		printPostUtil(in, inStart+offset+1, inEnd, post, postStart+offset, postEnd-1);
		
	}
	
	private static int searchForRoot(int[] in, int start, int end, int root){
		for(int i=start; i<=end; i++)
			if(root==in[i])
				return i;
		return -1;
	}

}
