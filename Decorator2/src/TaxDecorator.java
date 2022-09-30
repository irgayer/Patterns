public class TaxDecorator extends Tax {
    private Tax tax;

    public TaxDecorator(Tax tax)
    {
        this.tax = tax;
    }

    @Override
    public int getPercentage() {
        return this.tax.getPercentage();
    }
}
