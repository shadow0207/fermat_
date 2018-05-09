package com.timepass.fermat;

import java.util.Scanner;

/**
 * Special case: when a is not divisible by p Fermat little theorem, a^p
 * congruent to a(mod p) if a is not divisible by p,a^(p-1) congruent to 1(mod
 * p)
 * 
 * @author sarbajit
 *
 */
public class FermatLittle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int pow = sc.nextInt();
		int p = sc.nextInt();

		compute(a, pow, p);

	}

	private static void compute(int a, int pow, int p) {
		System.out.println(a + "^" + pow + " mod " + p + " = " + calculateFermat(a, pow, p));

	}

	private static boolean checkPrime(int a, int pow, int p) {
		int remainder = (int) ((Math.pow(a, pow) - a) % p);
		return remainder == 0 ? true : false;

	}

	private static int calculateFermat(int a, int pow, int p) {

		int powUpd = p - 1;
		int powFin = pow % powUpd;
		int remainder = (int) (Math.pow(a, powFin) % p);
		return remainder;
	}

}
