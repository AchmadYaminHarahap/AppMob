package ch04;

public class responsi6_nomor2i {
	public static void main(String[] args) {
        	System.out.println("Hitunglah selisih angka-angka dengan angka setelahnya pada array dibawah ini");
		int nilai[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        		for (int a = 0; a<nilai.length; a++) {
            			System.out.print(nilai[a] +", ");
        		}

        		System.out.println("\n");
        		System.out.println("menampilkan selisih angka-angka dengan angka setelahnya");

        		int selisih;
        		for (int a = 0; a<nilai.length-1; a++) {
            			selisih = nilai[a] - nilai[a+1];
            			selisih = Math.decrementExact(selisih);
            			System.out.println("selisih angka ke-" +a+ "=" +nilai[a]+ " dan angka ke-" +(a+1)+ "=" +nilai[a+1]+ " yaitu " +selisih);
        		}

    	}

}

