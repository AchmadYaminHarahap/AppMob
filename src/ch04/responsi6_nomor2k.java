package ch04;

public class responsi6_nomor2k {
    public static void main(String[] args) {
        System.out.println("Tentukan angka yang setelah nya lebih besar pada array dibawah ini");
        int [] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

            for (int a = 0; a<nilai.length; a++) {
            	System.out.print(nilai[a] +", ");
        	}

        	System.out.println("\n");
        	System.out.println("Menampilkan angka yang setelah nya lebih besar");

            for (int a = 0; a<nilai.length; a++) {
            	if (a < nilai.length-1) {
                if (nilai[a+1] > nilai[a]) {
                    System.out.print(nilai[a] +", ");
                }
            }
        }
    }
}