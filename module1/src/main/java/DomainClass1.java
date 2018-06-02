public class DomainClass1 {
    public static void main(String[] args) {
        DomainClass1 domainClass1 = new DomainClass1();
        System.out.println( "Special number is = " + domainClass1.convert( 234));
    }
    public int convert( int inputNumber) {
        return inputNumber * inputNumber - 2 + 4;
    }
    public int convert2( int inputNumber) {
        return inputNumber * inputNumber - 2 + 4;
    }
}
