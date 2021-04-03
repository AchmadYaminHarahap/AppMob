package ch04;

public class responsi6_nomor2l {
    public static void main(String[] args) {
        int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

       	 	for (int a = 0; a< nilai.length; a++) {
            			System.out.print(nilai[a] +", ");
        		}

        		System.out.println("\n");
        		System.out.println("Menampilkan jumlah angka dengan angka setelahnya yang hasil penjumlahannya bernilai genap di dalam array");

        		for (int a = 0; a<nilai.length; a++) {
            			if (a < nilai.length-1) {
                				if (nilai[a] % 2 == 0 && nilai[a+1] % 2 == 0) {
                    				int jumlah = nilai[a] + nilai[a+1];
                    				System.out.println(nilai[a] + " dan " + nilai[a+1] + " hasil jumlah " + jumlah);
                				}
            			}
        		}

    	}

}
