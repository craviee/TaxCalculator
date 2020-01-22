// package com.bartoszwalter.students.taxes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public static void main(String[] args)
{		
	ContractFactory factory = new ContractFactory();
	Contract contract;
	ReadData reader = new ReadData();

	contract = factory.getContract(reader.getRawIncome, reader.getContractType);
	if(contract != null)
	{
		contract.performCalculations();
		contract.printData();
	}
	else
	{
		System.out.println("Unknown type of contract!");
	}
}
