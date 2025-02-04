public class Hawaii extends State {

    public Hawaii() {
        this.salesTaxBehavior = new four_five_Percent();
        this.setName("Hawaii");
    }
    // ensures that the showTax method is implemented
    @Override
    public void showTax(double saleAmount) {
        super.showTax(saleAmount);
    }
}

