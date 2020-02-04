class EmploymentContract extends Contract {

    EmploymentContract(double i) {
        incomeTax = 111.25;
        exemptedValue = 46.33;
        name = "Employment";
        income = i;
        pension = calculatePension(i);
        disability = calculateDisability(i);
        illness = calculateIllness(i);
        incomeAfterTax = calculateIncomeAfterTaxes(income);
        firstHealthAssurance = calculateFirstHealthAssurance(incomeAfterTax);
        secondHealthAssurance = calculateSecondHealthAssurance(incomeAfterTax);
        incomeAfterInsurance = calculateIncomeAfterInsurance(incomeAfterTax);
        taxBasis = incomeAfterTax - incomeTax;
        advanceTax = taxBasis * percentAdvanceTax;
        advanceTaxOffice = advanceTax - secondHealthAssurance - exemptedValue;
        salary = income - ((pension + disability + illness) + firstHealthAssurance + advanceTaxOffice);
        advancedIncomeTax = ((incomeAfterTax - incomeTax) * advancedIncomeTaxPercentage) / 100;
    }
}