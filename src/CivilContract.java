class CivilContract extends Contract {

    CivilContract(double i) {
        exemptedValue = 0.0;
        name = "Civil";
        income = i;
        pension = calculatePension(i);
        disability = calculateDisability(i);
        illness = calculateIllness(i);
        incomeAfterTax = calculateIncomeAfterTaxes(income);//oBasis, cBasis
        firstHealthAssurance = calculateFirstHealthAssurance(incomeAfterTax);
        secondHealthAssurance = calculateSecondHealthAssurance(incomeAfterTax);
        incomeAfterInsurance = calculateIncomeAfterInsurance(incomeAfterTax);
        incomeTax = (i - pension - disability - illness) * 20 / 100;
        taxBasis = incomeAfterTax - incomeTax;//basisTax
        advanceTax = taxBasis * percentAdvanceTax;
        advanceTaxOffice = advanceTax - secondHealthAssurance - exemptedValue;
        salary = income - ((pension + disability + illness) + firstHealthAssurance + advanceTaxOffice);//healthTaxType1 + advanceTaxOfficeRounded);
        advancedIncomeTax = (taxBasis * advancedIncomeTaxPercentage) / 100;
    }
}