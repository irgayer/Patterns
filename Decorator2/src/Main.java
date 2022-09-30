public class Main {
    public static void main(String[] args) {
        var noblesseFromCambodia = new NoseTaxDecorator(
                new InclusiveTaxDecorator(
                        new CorporateTaxDecorator(
                                new DefaultIncomeTax())));

        System.out.println("Noblesse from Cambodia has " + noblesseFromCambodia.getPercentage() + "% taxes");
        var personFromUsa = new CorporateTaxDecorator(new DefaultIncomeTax());
        System.out.println("Regular person from USA has " + personFromUsa.getPercentage() + "% taxes");
    }
}