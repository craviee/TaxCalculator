import java.util.Map;
import java.util.HashMap;

class Contract {
    double income;
    double incomeTax = 111.25;
    double percentPensionTax=9.76/100;
    double percentDisableTax=1.5/100;
    double percentIllnessTax=2.45/100;
    double percentAdvanceTax=18/100;
    double percentFirstHealthTax=9;
    double percentSecondHealthTax=7.75;
    double advancedIncomeTaxPercentage = 18;
    double exemptedValue = 46.33;
    double advancedIncomeTax = 0;
    double pension,disability,illness;
    double incomeAfterTax,firstHealthAssurance;
    double secondHealthAssurance,incomeAfterInsurance, taxBasis;
    double advanceTaxOffice, salary;
    String name;
 public Contract(double _income){
    income=_income;
    pension = income*percentPensionTax;
    disability = income*percentDisableTax;
    illness = income*percentIllnessTax;
    incomeAfterTax = income - pension - disability - illness;
    firstHealthAssurance = incomeAfterTax*percentFirstHealthTax/100;
    secondHealthAssurance = incomeAfterTax*percentSecondHealthTax/100;
    incomeAfterInsurance = incomeAfterTax - firstHealthAssurance - secondHealthAssurance;
    taxBasis = incomeAfterTax - incomeTax;
    advanceTaxOffice = percentAdvanceTax - secondHealthAssurance - exemptedValue;
    salary = income - (pension + disability + illness) + firstHealthAssurance + advanceTaxOffice;
 }
}