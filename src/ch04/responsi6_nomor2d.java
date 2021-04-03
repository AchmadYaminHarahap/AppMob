package ch04;

public class responsi6_nomor2d {

	public static void main(String[] args) {
	System.out.println("tentukan angka-angka kelipatan 3 di dalam array dibawah ini");
        		int nilai[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        		for (int x = 0; x<nilai.length; x++) {
            			System.out.print(nilai[x] +", ");
        		}

        		System.out.println("\n");
        		System.out.println("Menampilkan angka-angka kelipatan 3 di dalam array");

        		for (int x = 0; x < nilai.length; x++){
            			if (nilai [x] % 3 == 0){
                				System.out.print(nilai[x]+", ");
            			}
        		}

    }

} 