package com.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeController {
	
	
	@GetMapping("/prime/{num}")
	public String prime(@PathVariable("num") Integer number) {
 
	
		  int i =0;
	       int num=0;
	       
	       String  primeNumbers = "";

	       for (i = 1; i <= number; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter ==2)
		  {
		    
		     primeNumbers = primeNumbers + i+" ";
		  }	
	       }	
	       
	     
	       System.out.println(primeNumbers);
	       return primeNumbers;
	   }
		
	}
	

