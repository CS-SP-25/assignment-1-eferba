public class SalesTaxCalculator {
    // Takes the state and sale amount as input
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java SalesTaxCalculator <state> <saleAmount>");
            return;
        }

        String state = args[0];
        double saleAmount = Double.parseDouble(args[1]);

        State stateObj;
        SalesTaxBehavior taxBehavior;
        // Determines the state and sets the sales tax behavior
        switch (state) {
            case "Indiana":
                stateObj = new Indiana();
                taxBehavior = new SevenPercent();
                break;
            case "Alaska":
                stateObj = new Alaska();
                taxBehavior = new NoTax(); // Assuming NoTax is a class that implements SalesTaxBehavior with 0% tax
                break;
            case "Hawaii":
                stateObj = new Hawaii();
                taxBehavior = new four_five_Percent();
                break;
            default:
                System.out.println("Invalid state. Please enter either 'Indiana', 'Alaska', or 'Hawaii'.");
                return;
        }
        // Sets the sales tax behavior dynamically
        stateObj.setSalesTaxBehavior(taxBehavior);
        // Calculates and displays the sales tax
        double tax = stateObj.calculateTax(saleAmount);
        System.out.printf("The sales tax on $%.2f in %s is $%.2f.%n", saleAmount, state, tax);
    }
}