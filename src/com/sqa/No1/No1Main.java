package com.sqa.No1;

import java.util.Scanner;

public class No1Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in); 
		  System.out.println("Masukkan nilai maksimal deret = "); 
		  int batas = in.nextInt(); 
		  cetakFibonacci(batas); 
		  for (int i = 1; i <= batas; i++) {
	            int x = cetakFibonacci(i);
	            System.out.print(x + " ");
	      }
	}
	 static int cetakFibonacci(int batas) { 
		    // silakan isi bagian ini 
		 	if(batas == 1 || batas == 2) {
		 		return 1;
			} else {
				return cetakFibonacci (batas-1) + cetakFibonacci (batas-2);
			}
		 }
}
