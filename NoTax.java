// NoTax.java
public class NoTax implements SalesTaxBehavior {
    // computes the sales tax for Alaska with no sales tax
    @Override
    public double compute(double saleAmount) {
        return 0.00;
    }
}