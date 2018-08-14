package com.rodrigo.bdd_sample;

public class FizzBuzz {

	public String play(int number) {

		if(number==0) throw new IllegalArgumentException("Number invalid");
		if(isMultipleOf(number, 3) && isMultipleOf(number, 5)) return "FizzBuzz";
		if(isMultipleOf(number, 3)) return "Fizz";
		if(isMultipleOf(number, 5)) return "Buzz";

		return String.valueOf(number);
	}

	public boolean isMultipleOf(int value, int m) {
		return value % m == 0;
	}
}
