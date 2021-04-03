package ch06;
public class algoritma_selection_sort {
    public static void main(String[] args) {
        System.out.println("82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3");
        System.out.println("urutan array di atas setelah menggunakan algoritma selection sort");
        int[] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for(int x = 0; x < nilai.length-1; x++){
            int maksimal = x;
            for(int y = x; y < nilai.length; y++){
                boolean urutan = nilai[y] < nilai[maksimal];
                if(urutan){
                    maksimal = y;
                }
            }
            int z = nilai[x];
            nilai[x] = nilai[maksimal];
            nilai[maksimal] = z;
        }
        tampilkan(nilai);
    }
    public static void tampilkan(int[] nilai){
        for(int x = 0; x < nilai.length; x++){
            System.out.print(nilai[x]+ " ");
        }
    }
}