package com.sphere.practice;

import java.util.Scanner;

public class LifeUniverseEverything {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int input = scr.nextInt();
		while(input != 42) {
			System.out.println(input);
			input = scr.nextInt();
		}
		
	}

}
