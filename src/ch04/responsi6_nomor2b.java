package ch04;

import java.util.Scanner;

public class responsi6_nomor2b {

	public static void main(String[] args) {

		int[] a = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

	        	Scanner scan = new Scanner(System.in);

	        	for (int x = 0; x<a.length; x++) {
			System.out.print(a[x] +", ");
       	 	}

        		System.out.println("\n");
        		System.out.println("Mencari sebuah angka di dalam array");

        		System.out.print("Masukkan angka yg di nomor : ");
       	int nomor = scan.nextInt();

        		boolean status = false;
        		int y = 0;

        		for (int x = a.length-1; x >= 0; x--) {
            			if (a[x] == nomor) {
               				status = true;
                				y = x+1;
           		 	}
        		}

       		 if (status) {
            	System.out.println("Angka " +nomor+ " di temukan di urutan ke-" +y);
        		}else {
            	System.out.println("Angka " +nomor+ " tidak ada di dalam array");
        		}

	}

	}

