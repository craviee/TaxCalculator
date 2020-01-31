import java.text.DecimalFormat;
import java.util.Map;
import java.util.HashMap;

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
            System.out.println("Pension Tax: " + currencyFormat.format(contract.pension));
            System.out.println("Disability Tax: " + currencyFormat.format(contract.disability));
            System.out.println("Illness Tax: " + currencyFormat.format(contract.illness));
            System.out.println("Heatlh Tax: " + currencyFormat.format(contract.incomeAfterTax));
            System.out.println("Health Insurance:\n"
                + "\t" + contract.percentFirstHealthTax + "%: " + currencyFormat.format(contract.firstHealthAssurance)
                + "\t" + contract.percentSecondHealthTax + "%: " + currencyFormat.format(contract.secondHealthAssurance));
            System.out.println("Constant Income Tax: " + contract.incomeTax);
            System.out.println("Tax basis: " + currencyFormat.format(contract.taxBasis));
            System.out.println("Advanced Income Tax: \n"
                + "\t" + contract.advancedIncomeTaxPercentage + "%: " + currencyFormat.format(contract.advancedIncomeTax));
            System.out.println("Exempted Value: " + currencyFormat.format(contract.exemptedValue));
            System.out.println("Advance Tax Office: " + currencyFormat.format(contract.advanceTaxOffice));
            System.out.println("Net salary: " + currencyFormat.format(contract.salary));

            return 0;
        }
        catch (Exception e)
        {
            return 1;
        }
    }
}