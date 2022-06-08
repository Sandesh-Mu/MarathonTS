package com.springBoot.SpringBootReact;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.controller.PrimeController;

public class PrimeTestCases {
	 
	 
	   public static void main(String[] args) {
		   PrimeController controller=new PrimeController();
		    System.out.println("prime number:"+controller.prime(50));
	}
	 
	}


