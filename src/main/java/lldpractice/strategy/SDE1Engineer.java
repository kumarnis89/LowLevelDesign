package lldpractice.strategy;

public class SDE1Engineer extends Engineer{
    private BaseStrategy baseStrategy;

    public SDE1Engineer(String name, Designation designation, BaseStrategy baseStrategy) {
        super(name, designation);
        this.baseStrategy = baseStrategy;
    }

    @Override
    public double calculateIncrement() {
        return baseStrategy.calculate();
    }
}
