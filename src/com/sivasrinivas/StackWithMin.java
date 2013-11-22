package com.sivasrinivas;

import java.util.Stack;

public class StackWithMin extends Stack<NodeWithMin> {

	public static void main(String[] args) {
		StackWithMin stmin = new StackWithMin();
		stmin.push(3);
		System.out.println(stmin.peek().value);
		System.out.println(stmin.min());
		System.out.println(stmin.pop().value);
		
	}

	public void push(int value) {
		int newMin = Math.min(value, min());
		super.push(new NodeWithMin(value, newMin));
	}

	public int min() {
		if (this.isEmpty()) {
			return Integer.MAX_VALUE;
		} else {
			return peek().min;
		}
	}
}

class NodeWithMin {
	public int value;
	public int min;

	public NodeWithMin(int v, int min) {
		value = v;
		this.min = min;
	}
}