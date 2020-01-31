public class TaxCalculator {
    public static void main(String[] args) {
    Input input = new KeyboardInput();
    Output output = new PrintOutput();
    Contract contract;

    contract = ContractFactory.getContract(input.getIncome(), input.getContractType());
    System.out.println("contract.income: " + contract.income);
    output.log(contract);
    }
}
