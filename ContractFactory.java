package com.bartoszwalter.students.taxes;
import Contract;
import CivilContract;
import OrdinaryContract;
//import java.util.map;
public class ContractFactory {
    public static Contract getContract(Double income, String ContractType){
        
        Map<String, String> contractMap = new HashMap<String, String>();
        contractMap.put("O", new OrdinaryContract(income));
        contractMap.put("C", new CivilContract(income));
        return contractMap.get(ContractType);
    }
}


getContract(RawIncome, Contract String)
returns contract with the specified String or null if does not exist contract

