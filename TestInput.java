public class TestInput extends Input
{
    String contractType;
    double income;

    public TestInput(String contractType, double income)
    {
        super();
        
        contractType = this.contractType;
        income = this.income;
    }

    public double getIncome() { return Income; }
    public String getContractType() { return contractType; }
}