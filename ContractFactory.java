package com.bartoszwalter.students.taxes;
import Contract;
import CivilContract;
import OrdinaryContract;
public class ContractFactory {
    public static Contract getContract(Double income, String ContractType){
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


