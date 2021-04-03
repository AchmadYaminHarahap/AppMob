package ch08;
public class BoyerMoore_string_search {

	static int NOMOR_CHARS = 256;

    	static int max(int b) { return Math.max(1, b); }

    	static void BadCharHeuristic(char []str, int size, int[] badchar) {
        		int i;

        		for (i = 0; i < NOMOR_CHARS; i++)
            			badchar[i] = -1;

        		for (i = 0; i < size; i++)
            			badchar[(int) str[i]] = i;
    	}

    	static void search(char[]text, char[] pat) {
                int x = pat.length;
                int y = text.length;

                int[] badchar = new int[NOMOR_CHARS];

                BadCharHeuristic(pat, x, badchar);

                int q = 0;
                while(q <= (y - x)) {
                        int p = x-1;
                        while(p >= 0 && pat[p] == text[q+p])
                                        p--;

                        if (p < 0) {
                                System.out.println(q);
                                q += (q+x < y)? x-badchar[text[q+x]] : 1;
                        }else
                                q += max(p - badchar[text[q+p]]);
                        }
        }

    	public static void main(String []args) {

        		char[] text = "ABAAABCD".toCharArray();
        		char[] pat = "ABC".toCharArray();
        		search(text, pat);
    	}
}
