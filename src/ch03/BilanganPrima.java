package ch03;
import java.util.Scanner;
public class BilanganPrima {
    
    public static void main (String args []){
       Scanner masukan = new Scanner (System.in);
       System.out.println("Masukkan sebuah Bilangan : ");
              int bil = masukan.nextInt();
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