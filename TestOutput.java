public class TestOutput extends Output
{
    public TestOutput()
    {
        super();
    }

    public int log(Contract contract)
    {
        try
        {
            // DecimalFormat currencyFormat = new DecimalFormat("#.00");

            // System.out.println("@@@@@@@@@@@@@@ TEST OUPUT @@@@@@@@@@@@@@@@@");
            // System.out.println(contract.name + " contract");
            // System.out.println("Testing format: " + currencyFormat.format(contract.salary));
            // System.out.println("@@@@@@@@@@@@@@ TEST OUPUT @@@@@@@@@@@@@@@@@");

            return 0;
        }
        catch (Exception e)
        {
            return 1;
        }
    }
}
