package com.green.controller;

public class ThreadTests {

	public static void main(String[] args) {
		Count count = new Count();
		for(int i=0; i<100; i++) {
			new Thread() {
				public void run() {
					for(int j=0; j<100;j++) {
						System.out.println(count.view());
					}
				}
				
			}.start();
		}
		

	}

}
