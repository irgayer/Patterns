public class InclusiveTaxDecorator extends TaxDecorator {
    public InclusiveTaxDecorator(Tax tax) {
        super(tax);
    }

    @Override
    public int getPercentage() {
        return super.getPercentage() + 20;
    }
}
