import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class TaxCalculator {

    private static final double PENSION_TAX_RATE = 9.76;
    private static final double DISABLED_TAX_RATE = 1.5;
    private static final double ILLNESS_TAX_RATE = 2.45;
    private static final double HEALTH_TAX_TYPE_1_RATE = 9.00;
    private static final double HEALTH_TAX_TYPE_2_RATE = 7.75;

    public static double income = 0;
    public static char contractType = ' ';
    // social taxes
    public static double pensionTax = 0; // 9,76% of the income
    public static double disabledTax = 0; // 1,5% of the income
    public static double illnessTax = 0; // 2,45% of the income
    // health taxes
    public static double incomeTax = 111.25;
    public static double healthTaxType1 = 0; // 9% of the incomeTax
    public static double healthTaxType2 = 0; // 7,75 % of the incomeTax
    public static double advanceTax = 0; // income tax (18%) advance
    public static double exemptedValue = 46.33; // reduced value 46,33 PLN
    public static double advanceTaxOffice = 0;
    public static double advanceTaxOfficeRounded = 0;

    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            System.out.print("Provide income: ");
            income = Double.parseDouble(br.readLine());

            System.out.print("Contract type: (O)rdinary, (C)ivil: ");
            contractType = br.readLine().charAt(0);

        } catch (Exception ex) {
            System.out.println("Incorrect value");
            System.err.println(ex);
            return;
        }

        DecimalFormat df00 = new DecimalFormat("#.00");
        DecimalFormat df = new DecimalFormat("#");

        if (contractType == 'O') {
            System.out.println("Ordinary contract");
            System.out.println("basis for taxes " + income);
            double cBasis = colculatedBasis(income);
            System.out.println("Pension tax basis "
                    + df00.format(pensionTax));
            System.out.println("Disability tax basis "
                    + df00.format(disabledTax));
            System.out.println("Illness insurance basis  "
                    + df00.format(illnessTax));
            System.out
                    .println("Health insurance basis: "
                            + cBasis);
            calculateInsurance(cBasis);
            System.out.println("Health insutance: 9% = "
                    + df00.format(healthTaxType1) + " 7,75% = " + df00.format(healthTaxType2));
            System.out.println("Constant income tax cost "
                    + incomeTax);
            double taxBasis = cBasis - incomeTax;
            double taxBasis0 = Double
                    .parseDouble(df.format(taxBasis));
            System.out.println("Tax basis " + taxBasis
                    + " rounded " + df.format(taxBasis0));
            calculateBasis(taxBasis0);
            System.out.println("Advance for income tax 18 % = "
                    + advanceTax);
            System.out.println("Exempted value = " + exemptedValue);
            double exemtedTax = advanceTax - exemptedValue;
            System.out.println("Exempted tax = "
                    + df00.format(exemtedTax));
            calculateAdvance();
            advanceTaxOfficeRounded = Double.parseDouble(df.format(advanceTaxOffice));
            System.out.println("Advance for the tax office = "
                    + df00.format(advanceTaxOffice) + " rounded = "
                    + df.format(advanceTaxOfficeRounded));
            double salary = income
                    - ((pensionTax + disabledTax + illnessTax) + healthTaxType1 + advanceTaxOfficeRounded);
            System.out.println();
            System.out
                    .println("Net salary = "
                            + df00.format(salary));
        } else if (contractType == 'C') {
            System.out.println("CIVIL CONTRACT");
            System.out.println("Basis for taxes " + income);
            double oBasis = colculatedBasis(income);
            System.out.println("Pension tax "
                    + df00.format(pensionTax));
            System.out.println("Disability tax "
                    + df00.format(disabledTax));
            System.out.println("Illness insurance tax  "
                    + df00.format(illnessTax));
            System.out
                    .println("Basis for the health tax: "
                            + oBasis);
            calculateInsurance(oBasis);
            System.out.println("Healt tax: 9% = "
                    + df00.format(healthTaxType1) + " 7,75% = " + df00.format(healthTaxType2));
            exemptedValue = 0;
            incomeTax = (oBasis * 20) / 100;
            System.out.println("Income tax cost (constant) "
                    + incomeTax);
            double basisTax = oBasis - incomeTax;
            double basisTax0 = Double.parseDouble(df.format(basisTax));
            System.out.println("Basis tax " + basisTax
                    + " rouded " + df.format(basisTax0));
            calculateBasis(basisTax0);
            System.out.println("Advance for income tax 18 % = "
                    + advanceTax);
            double taxTaken = advanceTax;
            System.out.println("Tax taken = "
                    + df00.format(taxTaken));
            calculateAdvance();
            advanceTaxOfficeRounded = Double.parseDouble(df.format(advanceTaxOffice));
            System.out.println("Advance for tax office = "
                    + df00.format(advanceTaxOffice) + " rounded = "
                    + df.format(advanceTaxOfficeRounded));
            double salary = income
                    - ((pensionTax + disabledTax + illnessTax) + healthTaxType1 + advanceTaxOfficeRounded);
            System.out.println();
            System.out
                    .println("Net salary = "
                            + df00.format(salary));
        } else {
            System.out.println("Unknown contract!");
        }
    }

    public static void calculateAdvance() {
        advanceTaxOffice = advanceTax - healthTaxType2 - exemptedValue;
    }

    public static void calculateBasis(double basis) {
        advanceTax = (basis * 18) / 100;
    }

    public static double colculatedBasis(double basis) {
        pensionTax = (basis * PENSION_TAX_RATE) / 100;
        disabledTax = (basis * DISABLED_TAX_RATE) / 100;
        illnessTax = (basis * ILLNESS_TAX_RATE) / 100;
        return (basis - pensionTax - disabledTax - illnessTax);
    }

    public static void calculateInsurance(double basis) {
        healthTaxType1 = (basis * HEALTH_TAX_TYPE_1_RATE) / 100;
        healthTaxType2 = (basis * HEALTH_TAX_TYPE_2_RATE) / 100;
    }
}
