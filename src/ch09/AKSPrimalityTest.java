package ch09;

import java.util.Scanner;

public class AKSPrimalityTest {
public static long k[] = new long[1000];
    public static void koefesien(int bil){
        k[0] = 1;
        for(int a = 0; a < bil; k[0] = -k[0], a++){
            k[1+a] = 1;
            for(int b = a; b > 0; b--)
                k[b] = k[b-1]-k[b];
        }
    }
    public static boolean prima(int bil){
        koefesien(bil);
        k[0]++;
        k[bil]--;
        int a = bil;
        while((a--)>0&&k[a]%bil==0);
        return a < 0;
    }
    public static void main (String args []){
       Scanner input = new Scanner (System.in);
       System.out.println("Masukkan sebuah Bilangan : ");
              int bil = input.nextInt();
       boolean prima = true;
       
       //penggunaan for loop
       for (int i=2; i<bil; i++){
           
           if ((bil % i) == 0){
               prima = false;
               break;
               
           }
       }
       /*jika prima adalah true dan angka yang diberikan user bukanlah angka 0 dan 1
       */
    {
           if(prima)
               System.out.println(bil + " adalah bilangan prima");
           else
               System.out.println(bil + "bukanlah bilangan prima");
           }
	}

    }