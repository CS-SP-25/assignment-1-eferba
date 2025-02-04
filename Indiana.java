// Indiana.java
public class Indiana extends State {
    // constructor
    public Indiana() {
        this.salesTaxBehavior = new SevenPercent();
        this.setName("Indiana");
    }
    // ensures that the showTax method is implemented
    @Override
    public void showTax(double saleAmount) {
        super.showTax(saleAmount);
    }
}