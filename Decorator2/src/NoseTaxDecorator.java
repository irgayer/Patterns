public class NoseTaxDecorator extends TaxDecorator {
    public NoseTaxDecorator(Tax tax) {
        super(tax);
    }

    @Override
    public int getPercentage() {
        return super.getPercentage() + 3;
    }
}
