package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.Calculatorenitity;

public class CalculatorController {

	
	@GetMapping("/add")
    public String add(@RequestParam(value = "num1",required = true,defaultValue = "1")int num1,
			@RequestParam(value = "num2",required = true,defaultValue = "2" )int num2)
	{
		return "<h1>The addition is "+ Calculatorenitity.add(num1, num2)+"</h1>";
	}
	
    
    @GetMapping("/subtract")
    public String substract(@RequestParam(value = "num1",required = true,defaultValue = "1")int num1,
			@RequestParam(value = "num2",required = true,defaultValue = "2" )int num2)
	{
		return "<h1>The substraction is "+ Calculatorenitity.substract(num1, num2)+"</h1>";
	}
    
    @GetMapping("/multiplication")
    
    public String multiplication(@RequestParam(value = "num1",required = true,defaultValue = "1")double num1,
			@RequestParam(value = "num2",required = true,defaultValue = "2" )double num2
			)
	{
	return "<h1>The multiplication is "+Calculatorenitity .multiply(num1, num2)+"</h1>";
	}

    
}
