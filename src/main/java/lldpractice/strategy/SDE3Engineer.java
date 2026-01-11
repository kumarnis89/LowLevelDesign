package lldpractice.strategy;

public class SDE3Engineer extends Engineer{
    private BaseStrategy baseStrategy;

    public SDE3Engineer(String name, Designation designation, BaseStrategy baseStrategy) {
        super(name, designation);
        this.baseStrategy = baseStrategy;
    }

    @Override
    public double calculateIncrement() {
        return this.baseStrategy.calculate();
    }
}
