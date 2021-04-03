package ch03;
import java.util.Scanner;
public class BilanganTertinggi2Variabel {
   public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
   int a,b;
	System.out.print("Masukkan nilai A : ");
	a = scan.nextInt();
	System.out.print("Masukkan nilai B : ");
	b = scan.nextInt();
   if (a > b) {
       System.out.println("nilai "+a+" lebih besar");
      } else { 
       System.out.println("nilai "+b+" lebih besar");
      }
      
    }
  }

