package exercise25;

public class LegalPerson extends TaxPayer {

    private double incomeTaxRate;
    
    public LegalPerson(String name) {
        super(name);
        this.incomeTaxRate = (10 / 100.0);
    }

    public double calculateIncomeTax(double grossIncome) {
        return grossIncome * incomeTaxRate;
    }
}
