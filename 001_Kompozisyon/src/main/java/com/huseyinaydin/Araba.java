package com.huseyinaydin;

public class Araba {
	private Yakit yakit;
	
	public void calistir() {
		yakit = new Yakit() {
			public void depo() {
				System.out.println("Depo dolu");
			}
		};
		yakit.depo();
		System.out.println("Araba çalıştı");
	}
}
