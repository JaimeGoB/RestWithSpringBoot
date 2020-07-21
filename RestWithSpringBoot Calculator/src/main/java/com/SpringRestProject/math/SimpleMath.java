package com.SpringRestProject.math;

public class SimpleMath {
	
	public Double sum(Double firstNumber, Double secondNumber) {
		return firstNumber + secondNumber;
	}
	
	public Double subtraction(Double firstNumber, Double secondNumber) {
		return firstNumber - secondNumber;
	}
	
	public Double multiply(Double firstNumber, Double secondNumber) {
		return firstNumber * secondNumber;
	}
	
	public Double divide(Double firstNumber, Double secondNumber) {
		return firstNumber / secondNumber;
	}
	
	public Double mean(Double firstNumber, Double secondNumber) {
		return (firstNumber + secondNumber) / 2;
	}
	
	public Double squareRoot(Double firstNumber) {
		return (Double )Math.sqrt(firstNumber);
	}
}
