public class DefaultIncomeTax extends Tax {
    @Override
    public int getPercentage() {
        return super.getPercentage() + 15;
    }
}
