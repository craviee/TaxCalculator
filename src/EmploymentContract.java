class EmploymentContract extends Contract {

    EmploymentContract(double i) {
        incomeTax = 111.25;
        exemptedValue = 46.33;
        name = "Employment";
        income = i;
        pension = calculatePension(i);
        disability = calculateDisability(i);
        illness = calculateIllness(i);
        incomeAfterTax = calculateIncomeAfterTaxes(income);//oBasis, cBasis
        firstHealthAssurance = calculateFirstHealthAssurance(incomeAfterTax);
        secondHealthAssurance = calculateSecondHealthAssurance(incomeAfterTax);
        incomeAfterInsurance = calculateIncomeAfterInsurance(incomeAfterTax);
        taxBasis = incomeAfterTax - incomeTax;//basisTax
        advanceTax = taxBasis * percentAdvanceTax;
        advanceTaxOffice = advanceTax - secondHealthAssurance - exemptedValue;
        salary = income - ((pension + disability + illness) + firstHealthAssurance + advanceTaxOffice);//healthTaxType1 + advanceTaxOfficeRounded);
        advancedIncomeTax = ((incomeAfterTax - incomeTax) * advancedIncomeTaxPercentage) / 100;
    }
}