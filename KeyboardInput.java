import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
public class KeyboardInput extends Input
{
    String contractType;
    double income;
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    public KeyboardInput()
    {
        super();
        
        try {
            System.out.print("Enter income: ");
            income = Double.parseDouble(br.readLine());
            System.out.print("Contract Type: (E)mployment, (C)ivil: ");
            contractType = br.readLine().charAt(0) + "";
        
        } catch (Exception ex) {
            System.out.println("Incorrect");
            System.err.println(ex);
            return;
        }
    }

    public double getIncome() { return income; }
    public String getContractType() { return contractType; }
}