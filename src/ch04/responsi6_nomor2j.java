package ch04;

public class responsi6_nomor2j {
	public static void main(String[] args) {
        System.out.println("Hitunglah selisih angka genap dengan angka setelah nya yang genap pula pada array dibawah ini");
       		int nilai[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        			for (int a = 0; a<nilai.length; a++) {
            				System.out.print(nilai[a] +", ");
        			}

        			System.out.println("\n");
        			System.out.println("Menampilkan selisih angka genap dengan angka setelah nya genap pula");

        		int selisih;
        		for (int a = 0; a<nilai.length; a++) {
            			if (nilai[a] %2 == 0) {
                				for (int n = a+1; n<nilai.length; n++) {
                    				if (nilai[n] %2 == 0) {
                        					selisih = nilai[a] - nilai[n];
                        					selisih = Math.decrementExact(selisih);
                        					System.out.println("selisih angka ke-" +a+ "=" +nilai[a]+ " dan angka ke-" +(n+1)+ "=" +nilai[n]+ " yaitu : " +selisih);
                        					break;
                    				}
                				}
            			}
        		}

    	}

}   
