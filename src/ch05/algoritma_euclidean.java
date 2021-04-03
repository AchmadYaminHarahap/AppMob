package ch05;

import java.util.Scanner;

public class algoritma_euclidean {
    public static void main(String[] args) {
        System.out.println("Program java Algoritma Euclidean");

        Scanner scan = new Scanner(System.in);
        int p, q ;
            System.out.print("Masukkan angka pertama : ");
            p = scan.nextInt();
            System.out.print("Masukkan angka kedua : ");
            q = scan.nextInt();
                while (q > 0) {
                    int r = p % q;
            		p = q;
            		q = r;      
        		}
                System.out.println("PBB nya adalah : " +p);
} 

    }