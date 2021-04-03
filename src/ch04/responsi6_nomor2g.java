package ch04;

public class responsi6_nomor2g {
	public static void main(String[] args) {
                        System.out.println("Tentukan angka-angka kelipatan lima yang sebelum nya juga  angka kelipatan 5");
        		int nilai[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        		for (int a = 0; a<nilai.length; a++) {
            			System.out.print(nilai[a] +", ");
        		}

        		System.out.println("\n");
        		System.out.println("Menampilkan angka kelipatan lima yang sebelum nya juga  angka kelipatan 5");

        		for (int a = 1; a<nilai.length; a++) {
            			if (nilai[a] %5 == 0) {
                				if (nilai[a-1] %5 == 0) {
                    				System.out.println(nilai[a]);
                				}
            			}
        	}
    	}
}
