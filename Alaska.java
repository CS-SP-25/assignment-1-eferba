// Alaska.java
public class Alaska extends State {
    // constructor
    public Alaska() {
        this.salesTaxBehavior = new NoTax();
        this.setName("Alaska");
    }
    // ensures that the showTax method is implemented
    @Override
    public void showTax(double saleAmount) {
        super.showTax(saleAmount);
    }
}