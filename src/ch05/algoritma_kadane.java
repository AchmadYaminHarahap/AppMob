package ch05;

import java.util.Scanner;

public class algoritma_kadane {

    public static void main(String[] args){

        	System.out.println("Program java Algoritma kadane");

        	Scanner scan = new Scanner( System.in );

        	System.out.print("inputkan berapa banyak array : ");
                    int size = scan.nextInt();
        	System.out.print("Masukkan nilai array : ");
                    int[] nilai = new int[size];

        		for(int n = 0; n < size; n++){
            			nilai[n] = scan.nextInt ();
        		}

        		int SubMax = nilai[0];
        		int sum = 0;

        		for(int n = 0; n < size; n++){
            			sum = sum + nilai[n];
            			if(SubMax < sum){
                				SubMax = sum;
            			}else if(sum < 0){
                				sum = 0;
            			}
        		}

        		System.out.println ("sub array max : " + SubMax);

    	}
}   

