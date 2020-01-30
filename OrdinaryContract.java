package com.bartoszwalter.students.taxes;
import Contract;
class OrdinaryContract extends Contract {
    double constantIncomeCost=111.25;
    double tax18=18/100;
    public double taxBasis(){
        return super.insurance().get("IncomeAfterInsurance")-constantIncomeCost;
    }
    public double advanceTax(){
        return taxBasis() * tax18;
    }
}