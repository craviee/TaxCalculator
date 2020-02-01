public class TaxCalculator {
    public static void main(String[] args) {

    Input input;
    Contract contract;
    Output output;

    input = new TestInput(1000, "C");
//     input = new KeyboardInput();
    output = new PrintOutput();
    contract = ContractFactory.getContract(input.getIncome(), input.getContractType());

    output.log(contract);
    }
}
