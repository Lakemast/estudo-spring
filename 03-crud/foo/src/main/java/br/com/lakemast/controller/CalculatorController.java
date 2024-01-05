package br.com.lakemast.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.lakemast.math.Calculator;

@RestController
public class CalculatorController {
	
	Calculator calc;
	
	public CalculatorController() {
		calc = new Calculator();
	}
	
	@RequestMapping(value="/sum/{firstNumber}/{secondNumber}", method=RequestMethod.GET)
	public Double sum(@PathVariable(value = "firstNumber") String firstNumber, @PathVariable(value = "secondNumber") String secondNumber ) throws Exception {
		return calc.sum(firstNumber, secondNumber);
	}
	
	@RequestMapping(value="/subtraction/{firstNumber}/{secondNumber}", method=RequestMethod.GET)
	public Double subtraction(@PathVariable(value = "firstNumber") String firstNumber, @PathVariable(value = "secondNumber") String secondNumber ) throws Exception {
		return calc.subtraction(firstNumber, secondNumber);
	}
	
	@RequestMapping(value="/multiplication/{firstNumber}/{secondNumber}", method=RequestMethod.GET)
	public Double multiplication(@PathVariable(value = "firstNumber") String firstNumber, @PathVariable(value = "secondNumber") String secondNumber ) throws Exception {
		return calc.multiplication(firstNumber, secondNumber);
	}
	
	@RequestMapping(value="/division/{firstNumber}/{secondNumber}", method=RequestMethod.GET)
	public Double division(@PathVariable(value = "firstNumber") String firstNumber, @PathVariable(value = "secondNumber") String secondNumber ) throws Exception {
		return calc.division(firstNumber, secondNumber);
	}
	
	
	@RequestMapping(value="/mean/{firstNumber}/{secondNumber}", method=RequestMethod.GET)
	public Double mean(@PathVariable(value = "firstNumber") String firstNumber, @PathVariable(value = "secondNumber") String secondNumber ) throws Exception {
		return calc.mean(firstNumber, secondNumber);
	}
	
	@RequestMapping(value="/squareRoot/{firstNumber}", method=RequestMethod.GET)
	public Double squareRoot(@PathVariable(value = "firstNumber") String firstNumber) throws Exception {
		return calc.squareRoot(firstNumber);
	}
	
}
