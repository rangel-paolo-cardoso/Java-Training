package exercise25;

public class NaturalPerson extends TaxPayer {
    
    public NaturalPerson(String name) {
        super(name);
    }

    public double calculateIncomeTax(double grossIncome) {
        double incomeTax = 0.0;
        if (grossIncome < 1_400.01) {
            return incomeTax;
        } else if (grossIncome < 2_100.01) {
            incomeTax = grossIncome * (10 / 100.0);
        } else if (grossIncome < 2_800.01) {
            incomeTax = grossIncome * (15 / 100.0);
        } else if (grossIncome < 3_600.01) {
            incomeTax = grossIncome * (25 / 100.0);
        } else {
            incomeTax = grossIncome * (30 / 100.0);
        }
        return incomeTax;
    }
}
