package ch04;

public class responsi6_nomor2n {
    public static void main(String[] args) {

	int[] nilai = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3}; {
	int b = nilai.length-2;
        System.out.println("Menampilkan Jumlah Angka-Angka Didalam Array Dengan Seluruh Angka-Angka Sebelumnya ");
        int jumlah = 0;    
        for (int a = 0; a<nilai.length; a++) {
	      jumlah = jumlah + a;
	}
            {
            for (int a = 0; a < nilai.length; a++) {
	    if (a > b) {
		System.out.print(nilai[a]+" ");
	    }else{
		System.out.print(nilai[a]+",");
	    }
 	}
	System.out.print("\n\n Jumlahnya: "+jumlah);
        
			    }
                    }
            }
}