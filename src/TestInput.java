public class TestInput extends Input
{
    String contractType;
    double income;

    public TestInput(double _income, String _contractType)
    {
        super();
        
        contractType = _contractType;
        income = _income;
    }

    public double getIncome() { return income; }
    public String getContractType() { return contractType; }
}