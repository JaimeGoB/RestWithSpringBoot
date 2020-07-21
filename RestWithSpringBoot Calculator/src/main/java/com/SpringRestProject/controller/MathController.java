package com.SpringRestProject.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.SpringRestProject.exception.UnsupportedMathOperationException;
import com.SpringRestProject.math.SimpleMath;
import com.SpringRestProject.request.converters.NumberConverter;

/*Initialized and exposes http verbs to client AKA postman*/
@RestController
public class MathController {
	
	
	//Use math class to compute calculations
	private SimpleMath math = new SimpleMath();
	
	@RequestMapping(value= "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne,@PathVariable("numberTwo") String numberTwo) throws Exception {
		
		if(!(NumberConverter.isNumeric(numberOne)) || !(NumberConverter.isNumeric(numberTwo)) ){
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
				
		return math.sum(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}

	@RequestMapping(value= "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double subtraction(@PathVariable("numberOne") String numberOne,@PathVariable("numberTwo") String numberTwo) throws Exception {
		
		if(!(NumberConverter.isNumeric(numberOne)) || !(NumberConverter.isNumeric(numberTwo)) ){
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		return math.subtraction(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value= "/multiply/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double multiply(@PathVariable("numberOne") String numberOne,@PathVariable("numberTwo") String numberTwo) throws Exception {
		
		if(!(NumberConverter.isNumeric(numberOne)) || !(NumberConverter.isNumeric(numberTwo)) ){
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		return math.multiply(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value= "/divide/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double divide(@PathVariable("numberOne") String numberOne,@PathVariable("numberTwo") String numberTwo) throws Exception {
		
		if(!(NumberConverter.isNumeric(numberOne)) || !(NumberConverter.isNumeric(numberTwo)) ){
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		return math.divide(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value= "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
	public Double mean(@PathVariable("numberOne") String numberOne,@PathVariable("numberTwo") String numberTwo) throws Exception {
		
		if(!(NumberConverter.isNumeric(numberOne)) || !(NumberConverter.isNumeric(numberTwo)) ){
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		return math.mean(NumberConverter.convertToDouble(numberOne), NumberConverter.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value= "/squareRoot/{numberOne}", method = RequestMethod.GET)
	public Double squareRoot(@PathVariable("numberOne") String numberOne) throws Exception {
		
		if(!(NumberConverter.isNumeric(numberOne)) ){
			throw new UnsupportedMathOperationException("Please set a numeric value!");
		}
		
		return math.squareRoot(NumberConverter.convertToDouble(numberOne) );
	}
}
