package com.sqa.No10;

public class No10Main {

	public static void main(String[] args) {
		Sekolah sekolah = new Sekolah();
		SMA st = new SMA();
		
		st.nama("Sekolah Menengah Atas 1");
		st.alamat("Jl. Perintis Kemerdekaan");
		st.jenis("Sekolah Menengah Atas Negeri");
		
		sekolah.nama(); System.out.println(st.getNama());
		sekolah.alamat(); System.out.println(st.getAlamat());
		sekolah.jenis(); System.out.println(st.getJenis());
		
		SMK i = new SMK();
		i.nama("Sekolah Menengah Kejuruan PGRI");
		i.alamat("Jalan Bojong Gede");
		i.jenis("Sekolah Menengah Swasta");
		
		sekolah.nama(); System.out.println(i.getNama());
		sekolah.alamat(); System.out.println(i.getAlamat());
		sekolah.jenis(); System.out.println(i.getJenis());
		
		
	}
}
