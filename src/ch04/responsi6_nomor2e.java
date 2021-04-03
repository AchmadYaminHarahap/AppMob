package ch04;

public class responsi6_nomor2e {

	public static void main(String[] args) {
		System.out.println("tentukan angka-angka yang memiliki angka 2 pada array di bawah ini");
        		int nilai[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        		for (int x = 0; x<nilai.length; x++) {
            			System.out.print(nilai[x] +", ");
        		}

        		System.out.println("\n");
        		System.out.println("Menampilkan angka yang memiliki angka 2 di dalam array");

       

		for (int x = 0; x<nilai.length; x++) {
			boolean con = String.valueOf(nilai[x]).indexOf('2') > -1;
			if (con) System.out.print(nilai[x] +", ");
		}
    	}

}

