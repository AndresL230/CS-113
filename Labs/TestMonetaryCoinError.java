public class TestMonetaryCoinError {
    public static void main(String[] args) {
        MonetaryCoin valid, invalid;
        
        try {
            valid = new MonetaryCoin(8);
            invalid = new MonetaryCoin(-4);        
        }
        catch (IllegalMonetaryAmount e) {
            System.out.println(e.getMessage());
        }
    }
}