package br.com.lakemast.math;

import br.com.lakemast.exception.UnsupportedMathOperationException;

public class Calculator {

	public Calculator() {

	}

	private Double convertToDouble(String strNumber)  {
		if (strNumber == null)
			return 0D;
		String number = strNumber.replaceAll(",", ".");
		if (isNumeric(strNumber))
			return Double.parseDouble(number);
		else
			throw new UnsupportedMathOperationException("Inputs aren't numbers. Please insert valid numbers.");
	}

	private boolean isNumeric(String strNumber) {
		if (strNumber == null)
			return false;
		String number = strNumber.replaceAll(",", ".");
		return number.matches("^(-?)(0|([1-9][0-9]*))(\\.[0-9]+)?$");
	}

	public Double sum(String firstNumber, String secondNumber)  {

		Double soma = convertToDouble(firstNumber) + convertToDouble(secondNumber);
		return soma;
	}

	public Double subtraction(String firstNumber, String secondNumber)  {

		Double subtraction = convertToDouble(firstNumber) - convertToDouble(secondNumber);
		return subtraction;
	}

	public Double multiplication(String firstNumber, String secondNumber)  {
		Double multiplication = convertToDouble(firstNumber) * convertToDouble(secondNumber);
		return multiplication;

	}

	public Double division(String firstNumber, String secondNumber)  {

		Double divisor = convertToDouble(secondNumber);

		if (divisor == 0)
			throw new UnsupportedMathOperationException("Divisor must be different from zero.");
		
		Double dividend = convertToDouble(firstNumber);

		Double division = dividend / divisor;
		
		return division;

	}

	public Double mean(String firstNumber, String secondNumber)  {
		Double mean = (convertToDouble(firstNumber) + convertToDouble(secondNumber)) / 2;
		return mean;
	}

	public Double squareRoot(String radicandStr)  {

		Double radicand = convertToDouble(radicandStr);
		if (radicand < 0)
			throw new UnsupportedMathOperationException("Radicand must be greater or equal to zero.");
		return (Double) Math.sqrt(radicand);
	}

}
