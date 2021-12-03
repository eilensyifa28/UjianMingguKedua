package com.sqa.No4;

import java.util.Scanner;

public class No4Main {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in); 
		  System.out.println("Masukkan sisa BBM dalam tangki (liter) = "); 
		  int sisa = in.nextInt(); 
		  System.out.println("Masukkan konsumsi BBM kendaraan (km/liter) = ");
		  double jarakPerLiter = in.nextInt();
		  hitungSisaJarak(sisa, jarakPerLiter);
	}
	
	static double hitungSisaJarak(double sisa, double jarakPerLiter) {
		double sisaJarak = sisa * jarakPerLiter;
		System.out.println("Kecepatan rata-rata anda adalah = "+ sisaJarak);
		return sisaJarak;
	}
}
