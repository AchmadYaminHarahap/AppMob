package ch06;

public class algoritma_insertion_sort {
    public static void main(String[] args) {
        System.out.println("Mengurutkan Array di Bawah ini Menggunakan Algoritma Insertion Sort");
        int[] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for(int x = 1; x < nilai.length; x++){
            for(int y = x; y >= 1; y--){
                boolean urutan = nilai[y]<nilai[y-1];
                if(!urutan){
                    break;
                }
                int z = nilai[y];
                nilai[y] = nilai[y-1];
                nilai[y-1] = z;
            }
        }
        tampilkan(nilai);
    }
    public static void tampilkan(int[] nilai){
        for(int a = 0; a < nilai.length; a++){
            System.out.print(nilai[a]+ " ");
        }
    }
}
