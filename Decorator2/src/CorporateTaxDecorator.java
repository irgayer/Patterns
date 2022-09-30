public class CorporateTaxDecorator extends TaxDecorator {
    public CorporateTaxDecorator(Tax tax) {
        super(tax);
    }

    @Override
    public int getPercentage() {
        return super.getPercentage() + 5;
    }
}
