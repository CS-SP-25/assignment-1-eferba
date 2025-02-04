// State.java
public abstract class State {
    // instance variable
    protected SalesTaxBehavior salesTaxBehavior;
    private String name;
    // constructor
    public double calculateTax(double saleAmount) {
        return salesTaxBehavior.compute(saleAmount);
    }
    // getter
    public String getName() {
        return name;
    }
    // setter
    public void setName(String name) {
        this.name = name;
    }
    // implements the showTax method
    public void showTax(double saleAmount) {
        double tax = calculateTax(saleAmount);
        System.out.printf("The sales tax on $%.2f in %s is $%.2f.%n", saleAmount, getName(), tax);
    }
    // method to set the sales tax behavior
    public void setSalesTaxBehavior(SalesTaxBehavior salesTaxBehavior) {
        this.salesTaxBehavior = salesTaxBehavior;
    }
}