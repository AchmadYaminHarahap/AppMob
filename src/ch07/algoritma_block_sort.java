package ch07;

public class algoritma_block_sort {
    public static void main(String[] args) {        
        System.out.println("mengurutkan array menggunakan algoritma block short");     
        int [] nilaiArray = new int [] {82,12,41,38,19,26,9,48,20,55,8,32,3};     
        int c = 0;    
            
           
        System.out.println("Array Sebelum di urutkan: ");    
        for (int a = 0; a < nilaiArray.length; a++) {     
            System.out.print(nilaiArray[a] + " ");    
        }    
            
            
        for (int a = 0; a < nilaiArray.length; a++) {     
            for (int b = a+1; b < nilaiArray.length; b++) {     
               if(nilaiArray[a] < nilaiArray[b]) {    
                   c = nilaiArray[a];    
                   nilaiArray[a] = nilaiArray[b];    
                   nilaiArray[b] = c;    
               }     
            }     
        }    
            
        System.out.println();    
                
        System.out.println("Sesudah Di Urutkan: ");    
        for (int i = 0; i < nilaiArray.length; i++) {     
            System.out.print(nilaiArray[i] + " ");    
        }    
    }    
}  

