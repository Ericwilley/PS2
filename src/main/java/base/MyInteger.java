package base;

import java.io.*;
import java.util.Scanner;

public class MyInteger {

	int iValue;

	MyInteger(int number) {
		iValue = number;
	}

	private int getValue() {
		return iValue;
	}

	public boolean isEven(int n) {
		return (n % 2 == 0);
	}

	public boolean isOdd(int n) {
		return !isEven(n);
	}

	public boolean isPrime(int n) {
		for (int f = 2; f < n / 2; f++) {
			if (n % f == 0) {
				return false;
			}
		}
		return true;
	}

	public boolean isEven(MyInteger n) {
		return n.isEven();
	}

	public boolean isOdd(MyInteger n) {
		return n.isOdd();
	}

	public boolean isPrime(MyInteger n) {
		return n.isPrime();
	}

	public boolean isEven() {
		return isEven(iValue);
	}

	public boolean isOdd() {
		return isOdd(iValue);
	}

	public boolean isPrime() {
		return isPrime(iValue);
	}

	public boolean equals(int n) {
		return (iValue == n);
	}

	public boolean equals(MyInteger n) {
		return equals(n.getValue());
	}
}
