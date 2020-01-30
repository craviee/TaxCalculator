import java.util.Map;
import java.util.HashMap;

class Contract {
    double rawIncome;
    double IncomeAfterTax;
    double percentPensionTax=9.76/100;
    double percentDisableTax=1.5/100;
    double percentIllnessTax=2.45/100;
    double percent9HealthInsurance=9/100;
    double percent775HealthInsurance=7.75/100;
 public Contract(double income){
    rawIncome=income;
 }
 public Map tax(){
    Map<String, Double> taxMap = new HashMap<String, Double>();
    taxMap.put("Pension", rawIncome*percentPensionTax);
    taxMap.put("Disability", rawIncome*percentDisableTax);
    taxMap.put("Illness", rawIncome*percentIllnessTax);
    taxMap.put("IncomeAfterTax", rawIncome-taxMap.get("Pension")-taxMap.get("Disability")-taxMap.get("Illness"));
    return taxMap;
 }
 public Map insurance(){
    Map<String, Double> insuranceMap = new HashMap<String, Double>();
    insuranceMap.put("HealthAssurance9", IncomeAfterTax*percent9HealthInsurance);
    insuranceMap.put("HealthAssurance775", IncomeAfterTax*percent775HealthInsurance);
    insuranceMap.put("IncomeAfterInsurance", IncomeAfterTax-insuranceMap.get("HealthAssurance9")-insuranceMap.get("HealthAssurance775"));
    return insuranceMap;
 }
}