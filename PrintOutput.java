public class PrintOutput extends Output
{
    public PrintOutput()
    {
        super();
    }

    public int log(Contract contract)
    {
        try
        {
            DecimalFormat currencyFormat = new DecimalFormat("#.00");

            System.out.println(contract.name + " contract");
            System.out.println("===============================");
            System.out.println("Income: " + contract.income);
            System.out.println("Pension Tax: " + currencyFormat.format(contract.pensionTaxBasis));
            System.out.println("Disability Tax: " + currencyFormat.format(contract.disabilityTaxBasis));
            System.out.println("Illness Tax: " + currencyFormat.format(contract.illnessTaxBasis));
            System.out.println("Heath Tax: " + contract.healthTaxBasis);
            System.out.println("Health insurance:\n"
                + "\t" + contract.firstHealthPercentage + "%: " + currencyFormat.format(contract.firstHealthTax) 
                + "\t" + contract.secondHealthPercentage + "%: " + currencyFormat.format(contract.secondHealthTax));
            System.out.println("Constant Income Tax: " + contract.constantIncomeTax);
            System.out.println("Tax basis: " + currencyFormat.format(contract.taxBaxis));
            System.out.println("Advanced Income Tax: \n"
                + "\t" + contract.advancedIncomeTaxPercentage + "%: " + currencyFormat.format(contract.advancedIncomeTax));
            System.out.println("Exempted Value: " + currencyFormat.format(contract.exemptedValue));
            System.out.println("Exempted Tax: " + currencyFormat.format(contract.exemtedTax));
            System.out.println("Advance Tax Office: " + currencyFormat.format(contract.advanceTaxOffice);
            System.out.println("Net salary: " + currencyFormat.format(contract.salary));

            return 0;
        }
        catch (Exception e)
        {
            return 1;
        }
    }
}