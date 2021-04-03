
package ch04;

public class responsi6_nomor2h {
	public static void main(String[] args) {
                System.out.println("Hitunglah jumlah pada array dibawah ini");
       		int nilai[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        		for (int n = 0; n<nilai.length; n++) {
            			System.out.print(nilai[n] +", ");
        		}

                        System.out.println("\n");
        		System.out.println("Menghitung jumlah angka di dalam array");

        		int jumlah = 0;
        		for (int n = 0; n<nilai.length; n++) {
            			jumlah = jumlah + nilai[n];
        		}

        		System.out.println(jumlah);

    	}
}