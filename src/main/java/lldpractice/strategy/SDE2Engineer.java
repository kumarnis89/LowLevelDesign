package lldpractice.strategy;

public class SDE2Engineer extends Engineer{
    private BaseStrategy baseStrategy;

    public SDE2Engineer(String name, Designation designation, BaseStrategy baseStrategy) {
        super(name, designation);
        this.baseStrategy = baseStrategy;
    }

    @Override
    public double calculateIncrement() {
        return this.baseStrategy.calculate();
    }
}
