public class KeyboardInput extends Input
{
    String contractType;
    double income;

    public KeyboardInput()
    {
        super();
        
        try {
            System.out.print("Enter income: ");
            income = Double.parseDouble(br.readLine());
            System.out.print("Contract Type: (E)mployment, (C)ivil: ");
            contractType = br.readLine().charAt(0);
        
        } catch (Exception ex) {
            System.out.println("Incorrect");
            System.err.println(ex);
            return;
        }
    }

    public double getIncome() { return Income; }
    public String getContractType() { return contractType; }
}