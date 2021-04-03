package ch04;

public class responsi6_nomor2c {


	public static void main(String[] args) {

	System.out.println("Tentukan angka-angka ganjil pada array di bawah ini");
        	int nilai[]  = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        	for (int i = 0; i < nilai.length; i++){
                			System.out.print(nilai[i]+", ");
        		}

                    System.out.println("\n");
                    System.out.println("Menampilkan angka yang bernilai ganjil di dalam array");

        		for (int i = 0; i<nilai.length; i++) {
            			if (nilai[i] % 2 != 0) {
                				System.out.print(nilai[i] +", ");
            			}
       		}

    	}

}