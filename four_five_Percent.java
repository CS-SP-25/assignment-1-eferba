public class four_five_Percent implements SalesTaxBehavior {

    @Override
    public double compute(double saleAmount) {
        return saleAmount * 0.045;
    }
}


