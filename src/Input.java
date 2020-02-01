public abstract class Input
{
    String contractType;
    double income;

    public Input(){};

    public abstract double getIncome();
    public abstract String getContractType();
}