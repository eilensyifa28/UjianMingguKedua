package com.sqa.No10;

public class SMK extends Sekolah{

	    private String nama;
	    private String alamat;
	    private String jenis;
	    
	    public SMK(){
	        System.out.println("---Sekolah Menengah Kejuruan---");
	    }
	    
	    public void nama(String x){
	        nama = x;
	    }
	    
	    public void alamat(String x){
	        alamat = x;
	    }
	    
	    public void jenis(String x){
	        jenis = x;
	    }
	    
	    public String getNama(){
	        return nama;
	    }
	    
	    public String getAlamat(){
	        return alamat;
	    }
	    
	    public String getJenis(){
	        return jenis;
	    }
}
