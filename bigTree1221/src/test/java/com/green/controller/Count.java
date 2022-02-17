package com.green.controller;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Count {
	private int count;
	public synchronized int view() {return count++;}

}
