import java.util.Scanner;

public class Coba {
	
	public static void main(String args []){ 
	    double jarakTempuh = 176.8; 
	    double kecepatanMobil = 68.9; 
	    double waktuTempuh = waktu (jarakTempuh, kecepatanMobil); 
	    System.out.printf("%.2f jam", waktuTempuh);
	  }
	  public static double waktu (double jarak, double kecepatan){
	    double waktu = jarak / kecepatan;
	    return waktu;
	  }
}
