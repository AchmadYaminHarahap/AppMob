package ch07;
public class algoritma_cocktail_sort {
 	public static void main (String[] args) {
		int[] bil = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3,};
	System.out.println("Cocktail Sort : ");
		boolean swapped;
		do {
			swapped = false;
			for (int a=0;a<=bil.length-2;a++) {
					if (bil[a]>bil[a+1]) {
						int temp = bil[a];
						bil[a] = bil[a+1];
						bil[a+1] = temp;
						swapped = true;
					}
			}
			if (!swapped) {
				break;
			}
			swapped = false;
                        System.out.println("Cocktail Sort : ");
			for (int a = bil.length-2;a>=0;a--) {
				if (bil[a]>bil[a+1]) {
					int temp = bil[a];
					bil[a] = bil[a+1];
					bil[a+1] = temp;
					swapped = true;
				}
			}
		}while (swapped);
	}
}