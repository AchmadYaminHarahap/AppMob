package ch04;

public class responsi6_nomor2f {

	public static void main(String[] args) {
		System.out.println("tentukan angka ganjil yang diapit angka genap pada array dibawah ini");
        		int nilai[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        		for (int x = 0; x<nilai.length; x++) {
            			System.out.print(nilai[x] +". ");
        		}

        		System.out.println("\n");
        		System.out.println("Menampilkan angka ganjil yang diapit angka genap di array");

        		for (int x = 0; x<nilai.length-1; x++) {
           		if (x != nilai.length-1) {
               			if (nilai[x] %2 != 0) {
                   			if (nilai[x-1] %2 == 0) {
                       				if (nilai[x+1] %2 == 0) {
                           				System.out.print(nilai[x] +", ");
                       					}
                   				}
               				}
           			}
        		}

    	}

}
