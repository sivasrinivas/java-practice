package com.sivasrinivas.dynamic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;


/**
 * You are given an array of integers with values greater than or equal to 0, for example: [5, 6, 0, 4, 2, 4, 1, 0, 0, 4]
 * You will develop and implement an algorithm to traverse the array in the shortest number of �hops� starting at index 0
 * Your program will implement the algorithm and write a solution to the standard output stream on a single line identifying
 * the array indices that comprise a solution path, with the indices separated by commas.
 * For this example, the following would be valid output: 0, 5, 9, out
 *
 * @author Siva
 */

public class ShortestJumps {
    /*
     *Reads the input from the given file path and calls calculateJumps method to find calculate solution
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("File path not found in arguments");
            return;
        }

        BufferedReader br;
        ArrayList<Integer> aList = aList = new ArrayList<Integer>();
        try {
            br = new BufferedReader(new FileReader(args[0]));
            String line;
            while ((line = br.readLine()) != null) {
                aList.add(Integer.parseInt(line));
            }
            br.close();
        } catch (IOException ioe) {
            System.err.println("Specified file path not found");
            return;
        } catch (NumberFormatException nfe) {
            System.err.println("Number format exception while parsing the given file");
            return;
        }

        calculateJumps(aList);
    }

    /*
     * For the given array, calculates minimum number of jumps required to cross array and calls method printIndices if there exists a solution
     */
    public static void calculateJumps(ArrayList<Integer> aList) {
        if (aList == null || aList.size() == 0)
            return;

        int size = aList.size();
        int[] jumps = new int[size + 1];
        int[] prev = new int[size + 1];

        jumps[0] = 0;
        prev[0] = -1;
        /* I am calculating minimum number of jumps required from 0 to each index, by traversing from 0 to size */
        for (int i = 1; i <= size; i++) {
            jumps[i] = Integer.MAX_VALUE;
            prev[i] = -1;
            for (int j = 0; j < i; j++) {
                if (i <= aList.get(j) + j && jumps[j] != Integer.MAX_VALUE && jumps[i] > jumps[j] + 1) {
                    jumps[i] = jumps[j] + 1;
                    prev[i] = j;
                }
            }
        }

        if (jumps[size] == Integer.MAX_VALUE)
            System.out.println("failure");
        else
            printIndices(prev);
    }

    /*
     *Prints the array indices using stack
     */
    public static void printIndices(int[] prev) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = prev.length - 1; prev[i] != -1; i = prev[i])
            stack.push(prev[i]);
        while (!stack.isEmpty())
            System.out.print(stack.pop() + ", ");
        System.out.println("out");
    }

}
