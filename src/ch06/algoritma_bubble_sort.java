package ch06;

public class algoritma_bubble_sort {

	public static void main(String[] args) {
	           System.out.println("Mengurutkan Array di Bawah ini Menggunakan Algoritma Bubble Sort");	
		int[] angka = {82,12,41,38,19,26,9,48,20,55,8,32,3};
		System.out.println("Nilai Dalam Array : 82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3");
		System.out.println("");
		System.out.println("Bubble Sort Array : ");
		for(int i = (angka.length - 1); i > 0; i--) {
			for(int k = 0; k < i; k++) {
				if(angka[k] > angka[(k + 1)]) {
					int disimpankan = angka[(k+1)];
					angka[(k+1)] = angka[k];
					angka[k] = disimpankan;
				}
			}
		}
		for(int i = 0; i < angka.length; i++) {
			System.out.print(angka[i] + " ");
		}
		System.out.println("");
	}
}
