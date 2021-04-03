package ch05;

import java.util.Scanner;

public class algoritma_longest_common_subsequence {
    public static void main (String[] args) {
    
        System.out.println("Program java Algoritma Longest Common Subsequence ");
    Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan String Pertama : ");
        		String A = scan.next();
        		System.out.print("Masukkan String Kedua: ");
        		String B = scan.next();

        		int a = A.length();
        		int b = B.length();

        		int[][] LCSarray = new int[a + 1][b + 1];

        		for (int i = 0; i <= a; i++) {
            			for (int j = 0; j <= b; j++) {
				if (i == 0 || j == 0) {
                    				LCSarray[i][j] = 0;
				} else if (A.charAt(i - 1) == B.charAt(j - 1)) {
                    				LCSarray[i][j] = LCSarray[i - 1][j - 1] + 1;
                				} else {
                    				LCSarray[i][j] = Math.max(LCSarray[i - 1][j], LCSarray[i][j - 1]);
                				}
            			}

        		}
    	}
}
