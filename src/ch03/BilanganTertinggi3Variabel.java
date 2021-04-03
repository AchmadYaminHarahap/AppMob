package ch03;
import java.util.Scanner;
public class BilanganTertinggi3Variabel {
   public static void main(String[] args){ 
   Scanner scan = new Scanner(System.in);
   int a,b,c;
   System.out.print("Masukkan nilai A : ");
	a = scan.nextInt();
	System.out.print("Masukkan nilai B : ");
	b = scan.nextInt();
	System.out.print("Masukkan nilai C : ");
	c = scan.nextInt(); 
       if (a > b && a > c) {
       System.out.println("nilai "+a+" lebih besar");
      } else if (b > c && b > a) {
       System.out.println("nilai "+b+" lebih besar");
      } else { 
       System.out.println("nilai "+c+" lebih besar");
      }
      
    }
  }
