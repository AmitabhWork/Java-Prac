/**
 * Created by amitabhs on 08/02/17.
 */
enum Currency {
    USD, EURO;

    public double conversionRateTo(Currency target) {
        return 1.0;
    }
}

public class Money {

    private double value;
    private Currency currency;

    public Money(double value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

}

class Test {
    private static void dispenseFunds(Money amount) {
/*some thing*/
    }

    private static void test() {
        Money balance = new Money(1.0,Currency.EURO);
        Money request = new Money(1.0,Currency.USD);


        if (balance.getValue() > request.getValue()) {
            dispenseFunds(request);

        }
    }
}
class MoneyTest{
    public static void main(String [] ag){
        Test ab =new Test();

    }
}