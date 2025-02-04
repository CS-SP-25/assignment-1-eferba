// SevenPercent.java
public class SevenPercent implements SalesTaxBehavior {
    // computes the sales tax for Indiana with 7% sales tax
    @Override
    public double compute(double saleAmount) {
        return saleAmount * 0.07;
    }
}