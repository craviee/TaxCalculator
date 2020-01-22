ReadData()

double getRawIncome();
double getContractType();

Can execute the following code on constructor:


try {
    System.out.print("Enter income: ");
    rawIncome = Double.parseDouble(br.readLine());
    System.out.print("Contract Type: (E)mployment, (C)ivil: ");
    contractType = br.readLine().charAt(0);

} catch (Exception ex) {
    System.out.println("Incorrect");
    System.err.println(ex);
    return;
}