package com.sqa.No3;

import java.util.Scanner;

public class No3Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in); 
		  System.out.println("Masukkan jarak (kilometer) = "); 
		  int jarak = in.nextInt(); 
		  System.out.println("Masukkan waktu (jam) = ");
		  double waktu = in.nextInt();
		  hitungKecepatan(jarak, waktu);
		  
	}
	
	 static double hitungKecepatan (double jarak, double waktu) { 
		    // silakan isi bagian ini 
		 	double kecepatan = jarak/waktu;
		 	System.out.println("Kecepatan rata-rata anda adalah = "+ kecepatan);
		 	return kecepatan;
		 }
}
