package com.jsp.package2;

import java.util.Scanner;

public class FbDriver {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		facebook[] f1 = new facebook[5];
		for (int i = 0; i < f1.length; i++) {
			System.out.println("please enter " + (i + 1) + " user name : ");
			String name = sc.next();
			System.out.println("please enter " + (i + 1) + " user id : ");
			int id = sc.nextInt();
			System.out.println("please enter " + (i + 1) + " user password : ");
			int password = sc.nextInt();
			facebook f = new facebook(name, id, password);
			f1[i] = f;
		}
		search(f1,f1.length);
	}

	public static void search(facebook[] f2,int n) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			System.out.println("please enter user id : ");
			int id = sc.nextInt();
			System.out.println("please enter user password : ");
			int password = sc.nextInt();
			for (int i = 0; i < n; i++) {

				if (id == f2[i].getId() && password == f2[i].getPassword()) {
					System.out.println("the user name is : " + f2[i].getName());
				}
			}
		}
	}

}
