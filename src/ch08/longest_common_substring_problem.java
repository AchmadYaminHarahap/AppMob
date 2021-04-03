package ch08;

public class longest_common_substring_problem {
static String X, Y; 
static int LCS(int a, int b, int opt) { 

    if (a == 0 || b == 0) { 
        return opt; 
    } 

    if (X.charAt(a - 1) == Y.charAt(b - 1)) { 
        opt = LCS(a - 1, b - 1, opt + 1); 
    } 
	opt = Math.max(opt, Math.max(LCS(a, b - 1, 0), 
                    LCS(a - 1, b, 0))); 
	return opt; 
} 

public static void main(String[] args) { 
    int p, q; 
    X = "ilhdtmnre"; 
    Y = "oelriytuhak"; 

    p = X.length(); 
    q = Y.length(); 

        System.out.println(LCS(p, q, 0)); 
} 
}