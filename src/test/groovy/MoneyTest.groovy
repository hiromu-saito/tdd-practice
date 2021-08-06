import spock.lang.Specification

class MoneyTest extends Specification{

    def "testMultiplication"(){
        setup:
        Dollar five = new Dollar(5);
        five.times(2);

        expect:
        five.amount == 10
    }

}
