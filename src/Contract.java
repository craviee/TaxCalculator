abstract class Contract {

    String name;
    protected double income;
    double incomeTax;
    double percentAdvanceTax = 18.0 / 100;
    double percentFirstHealthTax = 9;
    double percentSecondHealthTax = 7.75;
    double advancedIncomeTaxPercentage = 18;
    double exemptedValue;
    double advancedIncomeTax;
    double pension, disability, illness;
    double incomeAfterTax, firstHealthAssurance;
    double secondHealthAssurance, incomeAfterInsurance, taxBasis;
    double advanceTaxOffice, salary;
    double advanceTax = 0;

    double calculateIncomeAfterInsurance(double incomeAfterTax) {
        return incomeAfterTax - firstHealthAssurance - secondHealthAssurance;
    }

    double calculateFirstHealthAssurance(double incomeAfterTax) {
        return incomeAfterTax * percentFirstHealthTax / 100;
    }

    double calculateSecondHealthAssurance(double incomeAfterTax) {
        return incomeAfterTax * percentSecondHealthTax / 100;
    }

    double calculateIllness(double income) {
        double percentIllnessTax = 2.45 / 100;
        return income * percentIllnessTax;
    }

    double calculatePension(double income) {
        double percentPensionTax = 9.76 / 100;
        return income * percentPensionTax;
    }

    double calculateDisability(double income) {
        double percentDisableTax = 1.5 / 100;
        return income * percentDisableTax;
    }

    double calculateIncomeAfterTaxes(double income) {
        return income - pension - disability - illness;
    }
}

