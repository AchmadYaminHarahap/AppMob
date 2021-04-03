package ch04;

public class responsi6_nomor2m {
	public static void main(String[] args) {

		int[] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

		for (int i = 0; i<nilai.length; i++) {
			System.out.print(nilai[i] +", ");
        		}

        		System.out.println("\n");
        		System.out.println("Menghitung jumlah angka angka selisih yang di tampilkan pada nomor 9");

        		int jumlah = 0, selisih;
        		for (int i = 0; i < nilai.length-1; i++) {
            			selisih = nilai[i] - nilai[i+1];
            			System.out.println("selisih : " +nilai[i]+ " - " +nilai[i+1]+ " = " +selisih);
            			jumlah = jumlah + selisih;
                        }
		System.out.println("\n");
        		System.out.println("Jumlah dari selisih diatas adalah : " + jumlah);
    	}    
}
