import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TaxCalculatorTests {

    @Test
    @Order(1)
    void testCivilContractCalculation() {
        Input input = new TestInput(1000, "C");
        Contract contract = ContractFactory.getContract(input.getIncome(), input.getContractType());
        assertEquals(1000, contract.income);
        assertEquals("Civil", contract.name);
        assertEquals(97.60, contract.pension);
        assertEquals(15.00, contract.disability);
        assertEquals(24.50, contract.illness);
        assertEquals(862.9, contract.incomeAfterTax, "incomeAfterTax is not as expected.");
        assertEquals(77.661, contract.firstHealthAssurance);
        assertEquals(66.87474999999999, contract.secondHealthAssurance);
        assertEquals(172.58, contract.incomeTax);
        assertEquals(690.3199999999999, contract.taxBasis, "taxBasis is not as expected.");
        assertEquals(124.25759999999998, contract.advancedIncomeTax, "advancedIncomeTax is not as expected.");
        assertEquals(0, contract.exemptedValue);
        assertEquals(57.38284999999999, contract.advanceTaxOffice);
        assertEquals(727.8561500000001, contract.salary);
    }

    @Test
    @Order(2)
    void testOrdinaryContractCalculation() {
        Input input = new TestInput(1000, "E");
        Contract contract = ContractFactory.getContract(input.getIncome(), input.getContractType());
        assertEquals(1000, contract.income);
        assertEquals("Employment", contract.name);
        assertEquals(97.60, contract.pension);
        assertEquals(15.00, contract.disability);
        assertEquals(24.50, contract.illness);
        assertEquals(862.9, contract.incomeAfterTax);
        assertEquals(77.661, contract.firstHealthAssurance);
        assertEquals(66.87474999999999, contract.secondHealthAssurance);
        assertEquals(111.25, contract.incomeTax);
        assertEquals(751.65, contract.taxBasis, "taxBasis is not as expected.");
        assertEquals(135.297, contract.advancedIncomeTax);
        assertEquals(46.33, contract.exemptedValue);
        assertEquals(22.092250000000007, contract.advanceTaxOffice);
        assertEquals(763.14675, contract.salary);
    }
}