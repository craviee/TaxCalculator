import java.util.Map;
import java.util.HashMap;

public class ContractFactory {
    public static Contract getContract(Double income, String ContractType){
        
        Map<String, Contract> contractMap = new HashMap<String, Contract>();
        contractMap.put("E", new EmploymentContract(income));
        contractMap.put("C", new CivilContract(income));
        return contractMap.get(ContractType);
    }
}

