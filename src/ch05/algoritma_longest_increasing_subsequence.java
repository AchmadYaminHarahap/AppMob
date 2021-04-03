package ch05;

public class algoritma_longest_increasing_subsequence {
    public static int maksimal(int x[], int ending, int[] LIS ){
        for (int y = 0; y < ending; y++) {
            if (x[y] < x[ending] && LIS[y] > LIS[ending])
                LIS[ending] = LIS[y];
        }
        return LIS[ending];
    }
    private static int lis(int [] Nilai){
        int[] LIS = new int[Nilai.length];
        LIS[0] = 1;

        for(int x = 1; x < Nilai.length; x++){
            LIS[x] = 1 + maksimal(Nilai, x, LIS);
        }
        return LIS[Nilai.length-1];
    }

    public static void main(String[] args) {
        int [] Nilai = {3, 2, 1, 7, 6, 4, 6, 12, 9, 5, 15};
        System.out.println("Longest Inreasing Subsequence : "+lis(Nilai));
    }
}