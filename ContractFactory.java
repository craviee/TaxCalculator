package com.bartoszwalter.students.taxes;
import Contract;
import CivilContract;
import OrdinaryContract;
public class ContractFactory {
    public static Contract getContract(Double income, String ContractType){
        /*Map<String, String> contractMap = new HashMap<String, String>();
        contractMap.put("O", new OrdinaryContract(income));
        contractMap.put("C", new CivilContract(income));
        return contractMap
        */
        switch(ContractType){
            case "O":
                return new OrdinaryContract(income);
            case "C":
                return new CivilContract(income);
            default:
                return null;
        } 
        
    }
}


